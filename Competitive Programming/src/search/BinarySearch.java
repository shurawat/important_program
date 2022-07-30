package search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(find(arr, 4, 0, arr.length - 1));
	}

	public static int find(int[] arr, int key, int start, int end) {
		if (end < start) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (arr[mid] == key) {
			return mid;
		}
		if (arr[mid] > key) {
			return find(arr, key, start, mid - 1);
		} else {
			return find(arr, key, mid + 1, end);
		}

	}

}
