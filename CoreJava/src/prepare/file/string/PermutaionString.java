package prepare.file.string;

public class PermutaionString {
	
	public static void main(String[] args) {
		
		String s = "ABC";
		
		permute(s, 0, s.length()-1);
		
	}
	
	public static void permute(String s, int l, int e) {
		
		if(l == e) {
			System.out.println(s);
		} else {
			for(int i =l;i<=e;i++) {
				s = swap(s, l, i);
				permute(s, l+1, e);
				s = swap(s, l, i);
			}
		}
		
	}
	
	public static String swap(String s, int i, int j) {
		char temp; 
        char[] charArray = s.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray);	
	}

}
