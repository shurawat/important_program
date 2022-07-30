package dynamicprogramming;

public class LongestCommonSubsequence {
	
	String s1;
	String s2;
	int[][] dp;
	
	public LongestCommonSubsequence(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
		dp = new int[s1.length()+1][s2.length()+1];
	}
	
	public static void main(String[] args) {
		
		String s1 = "ABEDGH";
		String s2 = "AIDFHR";
		LongestCommonSubsequence lcs = new LongestCommonSubsequence(s1, s2);
		lcs.solve();
		lcs.show();
		int max = lcs.solveRecursive(s1, s2, s1.length(), s2.length());
		System.out.println(max);
	}
	
	public int solveRecursive(String s1, String s2, int m, int n) {
		if(m==0 || n==0) {
			return 0;
		}
		if(s1.charAt(m-1) == s2.charAt(n-1)) {
			return 1+ solveRecursive(s1, s2, m-1, n-1);
		}
		return Math.max(solveRecursive(s1, s2, m-1, n), solveRecursive(s1, s2, m, n-1));
	}
	
	public void solve() {
		for(int i=1;i<s1.length()+1;i++) {
			for(int j=1;j<s2.length()+1;j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); 
				}
			}
		}
	}
	
	
	public void show() {
		System.out.println("Max size is " + dp[s1.length()][s2.length()]);
		
		int i = s1.length();
		int j = s2.length();
		
		String lcs = "";
		
		while(i > 0 && j > 0) {
			if(s1.charAt(i-1) == s2.charAt(j-1)) {
				lcs += s1.charAt(i-1);
				i--;
				j--;
			}
			else if(dp[i-1][j] > dp[i][j-1]) {
				i--;
			} else {
				j--;
 			}
		}
		System.out.println(lcs);
		
		
	}

}
