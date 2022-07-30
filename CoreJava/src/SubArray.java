
public class SubArray {
	
	static int count = 0;
	final static int TARGET = 4;
	
	public static void main(String args[])
    {
        int[] arr = { 1, 2, 3, 4, 5, -1 , 2, 2};
        printSubArrays(arr, 0, 0);
        System.out.println(count);
    }
	
	
	// left > root > right     root > left > right >  left > right > root 
	
	public static void printSubArrays(int[] arr, int start, int end) {

		if(end == arr.length) {
			return;
		} else if(start>end) {
			printSubArrays(arr, 0, end + 1);
		} else {
			int sum = 0;
			for(int i = start; i<=end;i++) {
				sum = sum + arr[i];
				
			}
			if(sum == TARGET) {
				count ++;
				System.out.println("start " + start + " end " + end);
			}
			printSubArrays(arr, start+1, end);
		}
		
	}

}
