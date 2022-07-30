//https://leetcode.com/problems/gas-station/

package dynamicprogramming;

public class GasStationCycle {

	public static void main(String[] args) {
		
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		
		int n = cost.length;
		

		int pos = 0, total = 0, sum = 0;
		// lets take the first example

		for (int i = 0; i < n; i++) {
			sum += gas[i] - cost[i]; // 1-3 = -2 //2 - 4 =-2 //3 - 5 = -2 // 4 - 1 = 3 // 3 + ( 5 - 2) = 6
			if (sum < 0) {
				total += sum; // -2 // -4 // -6
				sum = 0;
				pos = i + 1; // 1 // 2 //3
			}
		}
		total += sum; // - 6 + 6 = 0

		System.out.println(total >= 0 ? pos : -1);
	}

}
