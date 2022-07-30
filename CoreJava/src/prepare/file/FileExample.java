package prepare.file;


public class FileExample {
	
	public static void main(String[] args) {
		
		int num = 200;
		int count = 1;
		int i = 1;
		while(count != num) {
			i=i+2;
			if(isPrime(i)) {
				count++;
			}
		}
		System.out.println(i);
		
	}
	
	public static boolean isPrime(int num) {
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
