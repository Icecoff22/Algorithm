package codingTest;

import java.io.*;
import java.util.*;

public class common {

    public static void main(String[] args) throws IOException {
        int n;
        int ans;
        int[] arr;
        int[] dp;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (n == 1) {
            System.out.println(arr[1]);
            return;
        }

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
        }


        System.out.println(dp[n]);
    }
}