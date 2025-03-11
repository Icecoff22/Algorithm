package codingTest;

import java.io.*;
import java.util.*;

public class common {

    public static void main(String[] args) throws IOException {
        int[][] arr;
        int n;
        int ans;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        arr = new int[n][3];

        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;

        for (int i = 1; i < n; i++) {
            arr[i][0] = (arr[i -1][0] + arr[i - 1][1] + arr[i - 1][2]) % 9901;
            arr[i][1] = (arr[i -1][0] + arr[i - 1][2]) % 9901;
            arr[i][2] = (arr[i -1][0] + arr[i - 1][1]) % 9901;
        }

        System.out.println((arr[n -1][0] + arr[n -1][1] + arr[n -1][2]) % 9901);
    }
}