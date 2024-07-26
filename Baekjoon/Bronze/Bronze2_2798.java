package day0725.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2798 {
    static int min = Integer.MAX_VALUE;
    static int res = Integer.MAX_VALUE;
    static int m;
    static int maxCount = 3;
    static int[] arr;

    static void solution(int idx, int cnt, int sum) {
        if (cnt == maxCount) {
            if (m - sum >= 0 && min > (m - sum)) {
                res = sum;
                min = m - sum;
            }

            return;
        }
        if (idx == arr.length) {
            return;
        }
        solution(idx + 1, cnt + 1, sum + arr[idx]);
        solution(idx + 1, cnt, sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(0, 0, 0);
        System.out.println(res);
    }
}