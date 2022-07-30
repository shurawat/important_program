package select;

import java.util.Random;

public class QuickSelect {

	static int[] nums = { 1, -2, 5, 8, 7, 6 };

	public static void main(String[] args) {

		int max = select(0, nums.length - 1, 3);
		System.out.println(max);
		// sort();

	}

	public static void sort() {
		for (int i = 1; i < nums.length + 1; ++i) {
			System.out.println(sort(i));
		}
	}

	public static int sort(int k) {
		return select(0, nums.length - 1, k - 1);
	}

	public static int select(int start, int last, int k) {
		int pivot = partition(start, last);
		if (pivot < k) {
			return select(pivot + 1, last, k);
		} else if (pivot > k) {
			return select(start, pivot - 1, k);
		}
		return nums[pivot];
	}

	public static int partition(int start, int last) {
		int pivot = new Random().nextInt(last-start+1)+start;
		swap(pivot, last);
		for(int i=start;i<last;i++) {
			if(nums[start] > nums[last]) {
				swap(i, start);
				start++;
			}
		}
		return start;
	}

	public static void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
