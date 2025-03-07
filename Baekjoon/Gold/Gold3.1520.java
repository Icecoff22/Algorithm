package codingTest;

import java.io.*;
import java.util.*;

public class common {

    static int[][] arr;
    static int[][] res;
    static int m, n;

    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[m][n];
        res = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                res[i][j] = -1;
            }
        }

        int ans = dfs(0, 0);

        System.out.println(ans);
    }

    public static int dfs(int y, int x) {
        if (y == m - 1 && x == n - 1) {
            return 1;
        }
        else if (res[y][x] != -1) {
            return res[y][x];
        }

        res[y][x] = 0;
        for (int i = 0; i < 4; i++) {
            int ay = y + dy[i];
            int ax = x + dx[i];

            if(ay < 0 || ay >= m || ax < 0 || ax >= n) {
                continue;
            }

            if (arr[ay][ax] < arr[y][x]) {
                res[y][x] += dfs(ay, ax);
            }
        }

        return res[y][x];
    }
}
