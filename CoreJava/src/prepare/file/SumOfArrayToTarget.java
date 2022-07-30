package prepare.file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArrayToTarget {

	public static void main(String[] args) {

		int[] arr = { 8, 7, 2, 5, 3, 1, 2 };
		int target = 10;

		Arrays.sort(arr);

		int low = 0;
		int high = arr.length - 1;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		while (low < high) {
			int sum = arr[low] + arr[high];
			if (sum == target) {
				List<Integer> l = new ArrayList<Integer>();
				l.add(arr[low]);
				l.add(arr[high]);
				list.add(l);
				low += 1;
			}
			if (sum < target) {
				low += 1;
			} else if (sum > target) {
				high -= 1;
			}
		}
		System.out.println(list);


	}

}
