package search;

public class LinearSearch {
	
	public static void main(String[] args) {
		int arr[] = {1,2,4,-1,22,5,101};
		System.out.println(search(arr, 5, 0));
	}
	
	public static int search(int[] arr, int key, int index) {
		if(index >= arr.length) {
			return -1;
		}
		if(arr[index] == key) return index;
		return search(arr, key, index+1);
	}

}
