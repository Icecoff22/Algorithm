import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> numMaps = new HashMap<>();
        int answer = 0;
        
        for (int num : nums) {
            int numElement = numMaps.getOrDefault(num, 0);
            numMaps.put(num, ++numElement);
        }
        
        for (int num : numMaps.keySet()) {
            answer++;
        }
        
        return Math.min(answer, nums.length / 2);
    }
}