package dynamicprogramming;

public class RodCutting {
	
	int rodLength;
	int[] prices;
	int[][] S;
	
	public RodCutting(int rodLength, int[] prices) {
		this.prices = prices;
		this.rodLength = rodLength;
		this.S = new int[prices.length+1][rodLength+1];
	}
	
	public static void main(String[] args) {
		int n = 5;
		int[] prices = {0,2,5,7,3,20};
		RodCutting cutting = new RodCutting(n, prices);
		cutting.solve();
		cutting.showSolution();
	}
	
	private void solve() {
		for(int i=1;i<prices.length;i++) {
			for(int j=1;j<rodLength+1;j++) {
				if(i <= j) {
					S[i][j] = Math.max((S[i-1][j]),( prices[i] + S[i][j-1]));
				} else {
					S[i][j] = S[i-1][j];
				}
				
			}
		}
	}
	
	public void showSolution() {
		System.out.println("Total benifit : " + S[prices.length-1][rodLength]);
	}

}
