package Programmers.Level2;

import java.util.HashMap;
import java.util.Map;

public class 의상 {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            if (map.get(clothes[i][1]) == null) {
                map.put(clothes[i][1], 1);
                continue;
            }
            int tmp = map.get(clothes[i][1]);
            map.put(clothes[i][1], tmp+1);
        }
        
        int answer = 1;
        
        for (String s : map.keySet()) {
            answer = answer * (map.get(s) + 1);
            
        }

        return answer - 1;
    }
}
