import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> ans = new ArrayList<>();
        
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                s.push(arr[i]);
                continue;
            }
            if (s.peek() != arr[i]) {
                s.push(arr[i]);
            }
        }
        for (int i = 0; i < s.size(); i++) {
            ans.add(s.get(i));
        }

        return ans;
    }
}