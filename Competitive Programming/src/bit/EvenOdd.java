package bit;

public class EvenOdd {
	
	public static void main(String[] args) {
		System.out.println(isEven(10));
		System.out.println(isEven(11));
		System.out.println(isOdd(10));
		System.out.println(isOdd(11));
	}
	
	public static boolean isEven(int n) {
		if((n ^ 1) == n+1) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int n) {
		if((n ^ 1) == n -1) {
			return true;
		}
		return false;
		
	}

}
