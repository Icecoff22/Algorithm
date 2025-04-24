package Programmers.Level2;

import java.util.HashMap;
import java.util.Map;

public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        boolean notAdd = false;

        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], 0);
        }
        
        for (int i = 0; i < 10; i++) {
            int tmp = map.getOrDefault(discount[i], 0);
            map.put(discount[i], tmp + 1);
        }
        
        for (int i = 0; i < want.length; i++) {
            if (map.get(want[i]) < number[i]) {
                notAdd = true;
                break;
            }
        }
        
        if (!notAdd) {
            answer += 1;
        }
        
        for (int i = 10; i < discount.length; i++) {
            int tmp = map.get(discount[i - 10]);
            map.put(discount[i - 10], tmp - 1);
            tmp = map.getOrDefault(discount[i], 0);
            map.put(discount[i], tmp + 1);
            
            for (int j = 0; j < want.length; j++) {
                if (map.get(want[j]) < number[j]) {
                    notAdd = true;
                    break;
                }
            }
            
            if (!notAdd) {
                answer += 1;
            }
            
            notAdd = false;
        }
        
        return answer;
    }
}
