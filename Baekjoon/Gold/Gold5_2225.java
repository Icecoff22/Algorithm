package Baekjoon.Gold;

import java.io.*;
import java.util.*;

public class Gold5_2225 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            arr[i][1] = 1;
        }

        for (int i = 1; i <= k; i++) {
            arr[1][i] = i;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                arr[i][j] = (arr[i - 1][j] + arr[i][j - 1]) % 1_000_000_000;
            }
        }

        System.out.println(arr[n][k]);
    }

}
