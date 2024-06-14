import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new LinkedHashMap<>();
        
        map.put("RT", 0);
        map.put("CF", 0);
        map.put("JM", 0);
        map.put("AN", 0);
        
        for (int i=0; i<choices.length; i++) {
            int num = choices[i] - 4;
            String tmpStr = survey[i];
            if (survey[i].charAt(0) > survey[i].charAt(1)) {//reverse
                tmpStr = String.valueOf(survey[i].charAt(1)) + String.valueOf(survey[i].charAt(0));
                if (num < 0) {
                    num = num + Math.abs(num * 2);
                }
                else {
                    num = num - Math.abs(num * 2);
                }
            }
            
            int getMapNum = map.get(tmpStr);
            map.put(tmpStr, getMapNum + num);
        }
        
        for (String key:map.keySet()) {
            
            int getMapNum = map.get(key);
            if (getMapNum > 0) {
                answer += key.charAt(1);
            }
            else {
                answer += key.charAt(0);
            }
        }
                
        return answer;
    }
}