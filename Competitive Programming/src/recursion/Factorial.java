package recursion;

public class Factorial {
	
	public static void main(String[] args) {
		int fac = head(4);
		int fact = tail(4, 1);
		System.out.println(fac);
		System.out.println(fact);
	}
	
	public static int head(int n) {
		if(n ==1 ) {
			return 1;
		}
		return n * head(n-1);
	}
	
	public static int tail(int n, int result) {
		if(n ==1 ) {
			return result;
		}
		return  tail(n-1, n*result);
	}

}
