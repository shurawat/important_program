package prepare.consecutivenumber;

public class ConsecutiveNumber {
	
	public static void main(String[] args) {
		int i = 12345;
		int previous = i%10 +1, current = 0;
		boolean isConscutive = true;
		
		while(i!=0) {
			current = i%10;
			i = i/10;
			if(current != previous -1) {
				isConscutive = false;
				break;
			}
			previous = current;
		}
		System.out.println(isConscutive);
	}

}
