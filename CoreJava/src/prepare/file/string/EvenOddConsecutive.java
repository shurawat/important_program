package prepare.file.string;

public class EvenOddConsecutive {

	static volatile int i = 0; 
	
	public static void main(String[] args) {
		String s = "67654437669922";
		
		StringBuilder s1 = new StringBuilder();
		while (i + 1 < s.length()) {
			int n = Integer.parseInt(String.valueOf(s.charAt(i)));
			int n1 = Integer.parseInt(String.valueOf(s.charAt(i + 1)));
			s1.append(s.charAt(i));
			if (n % 2 == 0 && n1 % 2 == 0) {
				s1.append("*");
			} else if (n % 2 != 0 && n1 % 2 != 0) {
				s1.append("-");

			}
			i++;
			
		}
		s1.append(s.charAt(i));
		System.out.println(s1.toString());
	}

}
