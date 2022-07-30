package prepare.paranthesis;

import java.util.Stack;

public class RedundantParanthesis {

	public static void main(String[] args) {

		String s = "((a+b-c)+c)";
		char[] ch = s.toCharArray();
		Stack<Character> st = new Stack<>();

		for (char c : ch) {
			if (c == ')') {
				char top = st.peek();
				st.pop();
				boolean flag = true;

				while (top != '(') {

					if (top == '+' || top == '-' || top == '*' || top == '/') {
						flag = false;
					}
					top = st.peek();
					st.pop();
				}
				if (flag == true) {
					System.out.println(true);
				}
			} else {
				st.push(c);
			}
		}

	}

}
