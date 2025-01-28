package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver2_1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        boolean[] checked = new boolean[n + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            int x = Integer.parseInt(st.nextToken());

            for (int j = 1; j <= n; j++) {
                if (cnt == x && !checked[j]) {
                    checked[j] = true;
                    arr[j] = i;
                    break;
                }
                if (!checked[j]) {
                    cnt++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
