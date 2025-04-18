package codingTest;

import java.io.*;
import java.util.*;

public class common {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];

        arr[0] = 1;

        for (int i = 2; i <= n; i+=2) {
            arr[i] = arr[i - 2] * 3;
            for (int j = i - 4; j >= 0; j-=2) {
                arr[i] += arr[j] * 2;
            }
        }

        System.out.println(arr[n]);
    }
}