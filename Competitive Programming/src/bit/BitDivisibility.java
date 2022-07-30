package bit;

import java.util.Scanner;

public class BitDivisibility {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		int remainder = 0;
		int n = 3;
		while(true) {
			
			int b = console.nextInt();
			
			if(b==1) {
				remainder = (remainder * 2 + 1);
			}else if(b==0) {
				remainder = (remainder * 2);
			}else {
				break;
			}
			System.out.println(remainder);
			if(remainder % n == 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}
		
		
	}
	
}
