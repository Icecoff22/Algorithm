package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class common {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int sum = 0, count = 0;

        int onePointer = 0;
        int twoPointer = 0;

        while (onePointer < n || twoPointer < n) {
            if (sum < n) {
                onePointer++;
                sum += onePointer;
            }
            else if (sum > n) {
                twoPointer++;
                sum -= twoPointer;
            }
            else {
                count++;
                onePointer++;
                sum += onePointer;
            }
        }

        System.out.println(count);
    }
}
