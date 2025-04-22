package Programmers.Level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤_고르기 {
    public int solution(int k, int[] tangerine) {
        
        int answer = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            if (map.get(tangerine[i]) == null) {
                map.put(tangerine[i], 1);
                continue;
            }
            int tmp = map.get(tangerine[i]);
            map.put(tangerine[i], tmp+1);
        }
        
        List<Integer> keys = new ArrayList<>(map.keySet());
        
        keys.sort(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        
        for (int i = 0; i < keys.size(); i++) {
            int tmp = map.get(keys.get(i));
            
            if (sum + tmp >= k) {
                answer += 1;
                break;
            }
            
            sum += tmp;
            answer += 1;
        }
        
        
        return answer;
    }
}
