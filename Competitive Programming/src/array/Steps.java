package array;

public class Steps {
	
	public static void main(String[] args) {
		System.out.println(steps(4));
		System.out.println(dSteps(4));
	}
	
	public static int steps(int n) {
		if (n==0) {
			return 1;
		} else if(n<0) {
			return 0;
		} else {
			return steps(n-1) + steps(n-2) +  steps(n-3);
		}
	}
	
	public static int dSteps(int n) {
		int[] res = new int[n+1];
		res[0] = 1;
		res[1] = 1;
		res[2] = 2;
		
		for(int i=3; i<=n; i++) {
			res[i] = res[i-1] + res[i-2] + res[i-3]; 
		}
		return res[n];
	}

}
