package Programmers.Level2;

import java.util.Arrays;

public class N개의_최소공배수 {
    public int solution(int[] arr) {
        int answer = 0;
        
        Arrays.sort(arr);
        
        for (int i = arr.length - 2; i >= 0; i--) {
            if (i == arr.length - 2) {
                int gcd2 = gcd(arr[i + 1], arr[i]);
                answer = arr[i + 1] * arr[i] / gcd2;
                continue;
            }
            int gcd2 = gcd(answer, arr[i]);
            answer = answer * arr[i] / gcd2;
        }
        
        return answer;
    }
    
    public int gcd(int a, int b) {
        while(a % b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
