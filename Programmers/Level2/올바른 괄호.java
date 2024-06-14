import java.util.*;
class Solution {
    boolean solution(String s) {

        Stack<Character> st = new Stack<>();
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')' && st.empty()) {
                return false;
            }
            else {
                st.pop();
            }
        }
        if (st.empty()) {
            return true;
        }
        return false;
    }
}