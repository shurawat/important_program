package prepare.graph;

public class MinimumCoins {
	
	public static void main(String[] args) {
		
		int[] coins = {1,2,3};
		int value = 10;
		int result = minValue(coins, coins.length, value);
		System.out.println(result);
		
	}
	
	public static int minValue(int[] coins, int length, int target) {
		if(target == 0) {
			return 0;
		}
		int result = Integer.MAX_VALUE;
		for(int i=0; i<length; i++) {
			if(coins[i]<=target) {
				int sub_result = minValue(coins, length, target-coins[i]);
				if(sub_result != Integer.MAX_VALUE && sub_result+1 < result) {
					result = sub_result+1;
				}
			}
		}
		return result;
	}

}
