import java.io.*;
import java.util.*;

public class Silver1_9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[][] arr = new int[2][n];
            int[][] res = new int[2][n];

            for (int l = 0; l < 2; l++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[l][j] = Integer.parseInt(st.nextToken());
                }
            }

            if (n == 1) {
                System.out.println(Math.max(res[0][0], res[1][0]));
            }

            res[0][0] = arr[0][0];
            res[1][0] = arr[1][0];
            res[0][1] = res[1][0] + arr[0][1];
            res[1][1] = res[0][0] + arr[1][1];

            for (int j = 2; j < n; j++) {
                for (int l = 0; l < 2; l++) {
                    if (l == 0) {
                        res[l][j] = Math.max(
                                Math.max(res[l + 1][j - 1] + arr[l][j], res[l][j-2] + arr[l][j]),
                                res[l + 1][j - 2] + arr[l][j]);
                    }
                    else {
                        res[l][j] = Math.max(
                                Math.max(res[l - 1][j - 1] + arr[l][j], res[l][j-2] + arr[l][j]),
                                res[l - 1][j - 2] + arr[l][j]);
                    }
                }
            }

            System.out.println(Math.max(res[0][n - 1], res[1][n - 1]));
        }
    }
}