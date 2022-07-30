package dynamicprogramming;

public class MaximumSubArray {
	
	public static void main(String[] args) {
		int[] nums = {1,-2,2,3,1};
		MaximumSubArray array = new MaximumSubArray();
		array.run(nums);
	}
	
	public void run(int[] nums) {
		int globalMax = nums[0];
		int currentMax = nums[0];
		int start = 0;
		int end = 0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i] < currentMax + nums[i]) {
				end = i;
			} else {
				start = i;
			}
			currentMax = Math.max(nums[i], currentMax + nums[i]);
			if(currentMax > globalMax) {
				globalMax = currentMax;
			}
			
		}
		System.out.println(start);
		System.out.println(end);
		System.out.println(globalMax);
	}
	

}
