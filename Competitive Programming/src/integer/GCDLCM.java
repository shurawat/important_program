package integer;

public class GCDLCM {
	
	public static void main(String[] args) {
		System.out.println(GCD(2,29));
		System.out.println(LCM(2,20));
	}
	public static int GCD(int n, int m) {
		if(m ==0) {
			return n;
		}
		return GCD(m, n%m);
	}
	
	public static int LCM(int n, int m) {
		return (n/GCD(n,m))*m;
	}
}
