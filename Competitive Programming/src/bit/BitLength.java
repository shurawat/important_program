package bit;

public class BitLength {
	
	public static void main(String[] args) {
		System.out.println(bitLength(20));
	}
	
	public static int bitLength(int n) {
		String bits = Integer.toBinaryString(n);
		System.out.println(bits);
		int counter = 0;
		while(n>0) {
			counter++;
			n = n >> 1; // divides by 2  -- << multiplies by 2
		}
		return counter;
	}

}
