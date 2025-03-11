package codingTest;

import java.io.*;
import java.util.*;

public class common {

    public static void main(String[] args) throws IOException {
        int[] arr;
        int n;
        int ans = Integer.MIN_VALUE;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            res[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    res[i] = Math.max(res[i], res[j] + 1);
                }
            }

            ans = Math.max(ans, res[i]);
        }

        System.out.println(ans);
    }
}