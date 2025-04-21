package Programmers.Level2;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int start = 0;
        int end = people.length - 1;
        
        while(true) {
            if (start > end) {
                break;
            }
            if (people[start] + people[end] > limit) {
                end--;
                count++;
                continue;
            }
            
            start++;
            end--;
            count++;
        }
        
        return count;
    }
}
