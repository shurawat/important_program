package dynamicprogramming;

public class SubsetSum {

	int m;
	int[] nums;
	boolean[][] S;

	public SubsetSum(int m, int[] nums) {
		this.m = m;
		this.nums = nums;
		this.S = new boolean[nums.length + 1][m + 1];
	}

	public static void main(String[] args) {
		int[] n = {1,7,4,3,6,5,9,11};
		int m = 43;
		SubsetSum subsetSum = new SubsetSum(m, n);
		subsetSum.solve();
		subsetSum.show();
	}

	private void solve() {

		for (int i = 0; i < nums.length + 1; i++) {
			S[i][0] = true;
		}

		for (int i = 1; i < nums.length + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if (j < nums[i - 1]) {
					S[i][j] = S[i - 1][j];
				} else {
					if (S[i - 1][j]) {
						S[i][j] = S[i - 1][j];
					} else {
						S[i][j] = S[i - 1][j - nums[i - 1]];
					}
				}

			}
		}

	}
	
	public void show() {
		System.out.println("there is the solution " + S[nums.length][m]);
		if(!S[nums.length][m]) {
			return;
		}
		int i = nums.length;
		int j = m;
		
		while(i!=0 || j!=0) {
			if(S[i][j] != S[i-1][j]) {
				System.out.println("item " + nums[i-1]);
				j = j - nums[i-1];
				i--;
			}else {
				i--;
			}
		}
	}

}
