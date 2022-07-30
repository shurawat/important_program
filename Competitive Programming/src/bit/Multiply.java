package bit;

public class Multiply {
	
	public static void main(String[] args) {
		System.out.println(multiply(5, 4));
		System.out.println(multiply(5, 4, 0));
	}
	
	public static int multiply(int a, int b) {
		int result = 0;
		while(b>0) {
			if((b^1) == b-1) {
				result = result + a;
			}
			
			a = a << 1;
			b = b >> 1;
		}
		return result;
	}
	
	public static int multiply(int a, int b, int result) {
		if(b==0) {
			return result;
		}
		if((b^1) == b-1) {
			result = result + a;
		}
		a = a << 1;
		b = b >> 1;
		return multiply(a, b, result);
	}

}
