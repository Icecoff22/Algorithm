package codingTest;

import java.io.*;
import java.util.*;

public class common {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Map<Integer, Boolean> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == null) {
                map.put(m - arr[i], true);
            }
            else {
                count++;
            }
        }

        System.out.println(count);

    }
}
