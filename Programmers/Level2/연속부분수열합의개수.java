package Programmers.Level2;

import java.util.HashMap;
import java.util.Map;

public class 연속부분수열합의개수 {
    Map<Integer, Integer> map = new HashMap<>();
    
    
    public int solution(int[] elements) {
        int answer = 0;
        
        int[] arr = new int[(elements.length * 2) + 1];
        
        
        for (int i = 0; i < 2; i++) {
            int tmp = i * elements.length;
            for (int j = 0; j < elements.length; j++) {
                arr[tmp + j] = elements[j];
            }
        }
        
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = 0; j < elements.length; j++) {
                sum += arr[i + j];
                if (map.get(sum) == null) {
                    map.put(sum, 1);
                }
            }
        }
        
        return map.keySet().size();
    }
}
