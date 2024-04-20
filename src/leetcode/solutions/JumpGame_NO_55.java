package leetcode.solutions;

public class JumpGame_NO_55 {
	
	/**
	 * There is very confusing description. Value is a max jump, e.g.:
	 * Array 2,3,1,0,0
	 * 
	 * arr[0] = 2 -> arr[2] = 1 -> arr[3] dead end if we keep using max jump
	 * arr[0] = 2 -> arr[1] = 3 -> arr[4] reached the end of the array
	 * 
	 * in other words, any jump between current and max jump needs to be evaluated
	 *
	 * The problem examples create illusion that jumps defined by values and linked.
	 */
    public boolean canJump(int[] nums) {
        return canJump(nums, 0, 0);
    }
    
    public boolean canJump(int[] nums, int prevMax, int maxPosition) {
        
    	if(nums.length-1 <= maxPosition) {
    		return true;
    	}
    	
    	int maxReach = 0;
    	for(int i = prevMax; i <= maxPosition; i++) {
    		if(nums[i] + i > maxReach) {
    			maxReach = nums[i] + i;
    		}
    	}
    	
    	if(maxReach > maxPosition) {
    		return canJump(nums, maxPosition, maxReach);
    	}
    	
    	return false;
    }

	
    public static void main(String[] args) {
    	JumpGame_NO_55 s = new JumpGame_NO_55();
		
		System.out.println(s.canJump(new int[] {1,23,4,5,6,7,8,53}));
		System.out.println(s.canJump(new int[] {1,2,3,1,5}));
		System.out.println(s.canJump(new int[] {7,6,5,4,3,2,1}));
		System.out.println(s.canJump(new int[] {7,6,5,4,2,3,1}));
		System.out.println(s.canJump(new int[] {1}));
		System.out.println(s.canJump(new int[] {1,1}));
		System.out.println(s.canJump(new int[] {1,0}));
		System.out.println(s.canJump(new int[] {0,1}));
		System.out.println(s.canJump(new int[] {2,2}));
		System.out.println(s.canJump(new int[] {}));
		System.out.println(s.canJump(new int[] {3,3,5,0,0,3,1,4}));
		System.out.println(s.canJump(new int[] {2,0}));
		System.out.println(s.canJump(new int[] {1,2,0,0,0}));

	}
}
