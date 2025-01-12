package dev.ilswe.leetcode.solutions.mmxxiv;

/*
 * To optimize, 1st iteration could be removed and value could be increase 
 * without a check since the problem constrains guarantee solution
 * 
 * However, just want to keep it readable for now, might optimize later.
 */

public class TwoSum2InputArrayIsSorted_NO_167 {
	public int[] twoSum(int[] numbers, int target) {

		// as per problem constraints, there is always exact one solution
		if (numbers == null || numbers.length <= 2) {
			return new int[] { 1, 2 };
		}

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int k = i + 1; k < numbers.length; k++) {
				int sum = numbers[i] + numbers[k];
				if (sum == target) {
					// normalize numbers, add one
					i += 1;
					k += 1;
					return new int[] { i, k };
				} else if (sum > target) {
					break;
				}

			}

			// Since solution is guaranteed by constraint, this check only adds performance
			// overhead
//			if(numbers[i] > target) {
//				throw new Exception("No sulution found (I)");
//			}
		}

//		throw new Throwable("No sulution found (II)");

		return null;
	}
}
