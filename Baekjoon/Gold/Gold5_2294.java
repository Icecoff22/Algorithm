package codingTest;

import java.io.*;
import java.util.*;

public class common {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] res = new int[k + 1];

        Arrays.fill(res, Integer.MAX_VALUE);
        res[0] = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= k; j++) {
                if (res[j - arr[i]] != Integer.MAX_VALUE) {
                    res[j] = Math.min(res[j], res[j - arr[i]] + 1);
                }
            }
        }

        if (res[k] == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else {
            System.out.println(res[k]);
        }
    }
}