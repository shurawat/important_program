package string;

public class RemoveAdjacentDuplicates {
	
	public static void main(String[] args) {
		System.out.println(remove("azxxxzy"));
	}
	public static char last_remove = '\0';
	public static String remove(String str) {
		
		if(str.length() == 0 || str.length() == 1) {
			return str;
		}
		
		if(str.charAt(0) == str.charAt(1)) {
			last_remove = str.charAt(0);
			while(str.length() > 1 && str.charAt(0) == str.charAt(1)) {
				str = str.substring(1, str.length());
			}
			str = str.substring(1, str.length());
			return remove(str);
		}
		
		String rem = remove(str.substring(1, str.length()));
		
		if(rem.length() != 0 && rem.charAt(0) == str.charAt(0)) {
			 return rem.substring(1, rem.length());
		}
		
		if(rem.length() ==0 && last_remove == str.charAt(0)) {
			return rem;
		}
		
		return str.charAt(0) + rem;
			
	}
	public static char last_removed = '\0';
	static String removeUtil(String str)
    {
 
        // If length of string is 1 or 0
        if (str.length() == 0 || str.length() == 1)
            return str;
 
        // Remove leftmost same characters and recur for
        // remaining string
        if (str.charAt(0) == str.charAt(1)) {
            last_removed = str.charAt(0);
            while (str.length() > 1
                   && str.charAt(0) == str.charAt(1))
                str = str.substring(1, str.length());
            str = str.substring(1, str.length());
            return removeUtil(str);
        }
 
        // At this point, the first character is definitely
        // different from its adjacent. Ignore first
        // character and recursively remove characters from
        // remaining string
        String rem_str
            = removeUtil(str.substring(1, str.length()));
 
        // Check if the first character of the rem_string
        // matches with the first character of the original
        // string
        if (rem_str.length() != 0
            && rem_str.charAt(0) == str.charAt(0)) {
            last_removed = str.charAt(0);
 
            // Remove first character
            return rem_str.substring(1, rem_str.length());
        }
 
        // If remaining string becomes empty and last
        // removed character is same as first character of
        // original string. This is needed for a string like
        // "acbbcddc"
        if (rem_str.length() == 0
            && last_removed == str.charAt(0))
            return rem_str;
 
        // If the two first characters of str and rem_str
        // don't match, append first character of str before
        // the first character of rem_str
        return (str.charAt(0) + rem_str);
    }
}
