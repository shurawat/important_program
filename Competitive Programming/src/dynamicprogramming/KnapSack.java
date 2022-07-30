package dynamicprogramming;

public class KnapSack {
	
	int n;
	int capacity;
	int[] weights;
	int[] values;
	int[][] S;
	
	public KnapSack(int n, int capacity, int[] weights, int[] values){
		this.n = n;
		this.capacity = capacity;
		this.weights = weights;
		this.values = values;
		this.S = new int[n+1][capacity+1];
	}
	
	public static void main(String[] args) {
		
		int items = 4;
		int capacity = 7;
		int[] weights = {0,1,3,4,5};
		int[] values =  {0,1,4,5,7};
		KnapSack knapSack = new KnapSack(items, capacity, weights, values);
		knapSack.solve();
		knapSack.showSolution();
		
		int maxValue = knapSack.solveRecursive(capacity, weights, values, items);
		System.out.println(maxValue);
		
	}
	
	public int solveRecursive(int m, int[] weights, int[] values, int n) {
		if(m==0||n==0) {
			return 0;
		}
		if(weights[n-1]>m) {
			return solveRecursive(m, weights, values, n-1);
		}else {
			int take = values[n-1] + solveRecursive(m-weights[n-1], weights, values, n-1);
			int notTake = solveRecursive(m, weights, values, n-1);
			return Math.max(take, notTake);
		}
	}
	
	public void solve() {
		
		// no need for initialization
		
		for(int i=1;i<n+1;i++) {
			for(int w=0;w<capacity+1;w++) {
				int notTakingItem = S[i-1][w];
				int takingItem = 0;
				if(weights[i]<=w) {
					takingItem = values[i] + S[i-1][w-weights[i]];
				}
				
				//memoization
				S[i][w] = Math.max(notTakingItem, takingItem);
			}
		}
		
	}
	
	public void showSolution() {
		
		System.out.println("Total benifit : " + S[n][capacity]);
		
		for(int i=n,w=capacity;i>0;i--) {
			if(S[i][w] != 0 && S[i][w] != S[i-1][w]) {
				System.out.println("We take the item : " + values[i]);
				w=w-weights[i];
			}
		}
		
		
	}
	
}
