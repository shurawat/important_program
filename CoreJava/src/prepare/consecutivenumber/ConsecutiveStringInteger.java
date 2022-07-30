package prepare.consecutivenumber;

public class ConsecutiveStringInteger {

	public static void main(String[] args) {
		String s = "100101102";
		boolean flag = false;
		int length = s.length();

		for (int i = 0; i < length / 2; i++) {
			String new_str = s.substring(0, i + 1);
			int n = Integer.parseInt(new_str);
			
			while (new_str.length() < length) {
				n = n + 1;
				new_str = new_str + String.valueOf(n);
			}
			
			if (new_str.equals(s)) {
				flag = true;
			}
		}
		
		System.out.println(flag);
	}

}
