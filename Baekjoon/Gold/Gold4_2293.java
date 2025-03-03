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
        res[0] = 1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());

            for (int j = arr[i]; j <= k; j++) {
                res[j] += res[j - arr[i]];
            }
        }

        System.out.println(res[k]);
    }

}
