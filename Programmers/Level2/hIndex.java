package Programmers.Level2;

import java.util.Arrays;

public class hIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int count = 0;
        
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                return h;
            }
            
        }
        
        return 0;
    }
}
