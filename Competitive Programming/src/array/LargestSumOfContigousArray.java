package array;

public class LargestSumOfContigousArray {
	
	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int size = arr.length;
		
		int max = arr[0];
		int current_max = arr[0];
		
		for(int i =1; i< size; i++) {
			
			current_max = Math.max(arr[i], current_max + arr[i]);
			max = Math.max(max, current_max);
			
		}
		
		System.out.println(max);
		
	}

}
