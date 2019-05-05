package programmers;

import java.util.*;

public class stackEx {

	public static void main(String[] args) {
		String s = "()(((()())(())()))(())";
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				st.push(i);
			} else {
				if(st.peek()+1==i) {
					st.pop();
					ans += st.size();
				} else {
					st.pop();
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
