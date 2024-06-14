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



import java.util.*;
class Solution {
    boolean solution(String s) {
        int count = 0;
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
            }
            else if (ch == ')' && count==0) {
                return false;
            }
            else {
                count--;
            }
        }
        if (count==0) {
            return true;
        }
        return false;
    }
}

//굳이 스택대신 int count 선언해서 활용해도 됨.
//이렇게 하면 성능 메모리 및 속도 향상의 이점을 볼 수 있음.