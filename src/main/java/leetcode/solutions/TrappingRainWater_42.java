package leetcode.solutions;

import java.util.Arrays;

/**
 * Solution to try: 1) Find highest point, that is the start point 2) Find the
 * next highest a peak (defined by elevation gain) moving left (array
 * descending) direction. 3) Exit criteria: if there is no peak found, there
 * will be no water accumulation on the left side. 4) Else,c calculate water
 * accumulation (see algorithm below) and sum up to all water accumulations
 * buffer 5) Now, consider 2nd highest peak as a start point, repeat algorithm
 * from 2
 * 
 * Apply the same steps 2-5 starting from the highest point moving to the right
 * (ascending array index)
 * 
 * To calculate water accumulation: Take 2nd highest point value multiplied by
 * distance between highest and 2nd highest points minus sum of all values
 * between those two points Remaining value is indicating amount of water that
 * is accumulated.
 * 
 * Note: not the best implementation, but using Arrays or streams will increase
 * number of iterations, therefore performance and memory usage.
 * 
 * Maybe try to redo this sequentially, left to right. Idea will be similar:
 * Find the 1st peak, then find the next one that is higher or similar height,
 * calculate accumulation, if there are no higher or similar peaks, take the
 * highest available. Reset 1st peak with current, continue again.
 * This approach is not much better than 1st, but it reduce number of iterations
 * and might have lest redundancy in the code as there is only one iteration
 * -> forward.
 */
public class TrappingRainWater_42 {
	public int trap(int[] height) {
		int totalAccumulation = 0;

		if (height.length < 3) {
			return 0;
		}

		// STEP 1, find the highest point
		int topPosition = 0;
		for (int i = 1; i < height.length; i++) {
			if (height[topPosition] < height[i]) {
				topPosition = i;
			}
		}

		// STEP 2, check accumulation before the top
		{
			int maxB = topPosition;
			int maxA = -1;

			boolean exit = false;
			do {
				//find the next highest point before current highest
				boolean ascending = false;
				for (int i = maxB; i >= 0; i--) {
					//skip values in the down slope from the top
					if (maxA == -1 && i > 0 && height[i] < height[i - 1]) {
						ascending = true;
						maxA = i;
					}

					if (ascending && (height[maxA] < height[i])) {
						maxA = i;
					}

				}

				//if there is no next highest point, exit
				if (maxA == -1) {
					exit = true;
				//otherwise sum accumulation
				} else {
					totalAccumulation += canAccumulate(height, maxA, maxB);
				}

				//reset the highest point to current 2nd, repeat
				maxB = maxA;
				maxA = -1;
				
				//iterate until there are no more tops found in the direction of search
			} while (exit == false);
		}

		// STEP 3, check accumulation after the top
		{
			int maxB = topPosition;
			int maxA = -1;

			boolean exit = false;
			do {
				//find the next highest point after current highest
				boolean ascending = false;
				for (int i = maxB; i < height.length; i++) {
					//skip values in the down slope from the top
					if (maxA == -1 && i < height.length - 1 && height[i] < height[i + 1]) {
						ascending = true;
						maxA = i;
					}

					if (ascending && (height[maxA] < height[i])) {
						maxA = i;
					}

				}

				if (maxA == -1) {
					exit = true;
				} else {
					totalAccumulation += canAccumulate(height, maxB, maxA);
				}

				//reset the highest point to current 2nd, repeat
				maxB = maxA;
				maxA = -1;

			//iterate until there are no more tops found in the direction of search
			} while (exit == false);
		}

		return totalAccumulation;
	}

	private int canAccumulate(int[] e, int hillAPos, int hillBPos) {
		int accumulation = 0;
		
		//water will dip on the lowest side of two hills
		int level = Math.min(e[hillAPos], e[hillBPos]);
		
		//sum up all points in between how much it could accumulate
		for (int i = hillAPos + 1; i <= hillBPos - 1; i++) {
			int tmp = level - e[i];
			accumulation += (tmp > 0 ? tmp : 0);
		}
		
		return accumulation;
	}

	public static void main(String[] args) {
		TrappingRainWater_42 solution = new TrappingRainWater_42();
		System.out.println(solution.trap(new int[] {5,5,1,7,1,1,5,2,7,6 }));
	}
}
