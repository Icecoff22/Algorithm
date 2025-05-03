import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> dq = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            dq.add(s.charAt(i));
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (checkDeque(new ArrayDeque<>(dq))) {
                answer++;
            }
            
            Character c = dq.pollLast();
            dq.addFirst(c);
        }
        
        return answer;
    }
    
    public boolean checkDeque(Deque<Character> dq) {
        Stack<Character> stack = new Stack<>();
        while (!dq.isEmpty()) {
            char c = dq.pollFirst();
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}