package recursion;

public class Febonacci {
	
	public static void main(String[] args) {
		int n = head(10);
		int k = tail(10, 0, 1);
		System.out.println(n);
		System.out.println(k);
	}
	
	public static int head(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		int fib1 = head(n-1);
		int fib2 = head(n-2);
		int res = fib1 + fib2;
		return res;
	}
	
	public static int tail(int n, int a, int b) {
		if(n == 0) return a;
		if(n == 1) return b;
		return tail(n-1, b, a+b);
	}
	
	

}
