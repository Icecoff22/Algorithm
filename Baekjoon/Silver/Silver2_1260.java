package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1260 {
    static int n, m, v;
    static int[][] arr;
    static Queue<Integer> q;
    static Stack<Integer> s;
    static boolean[] isVisited;

    private static void bfs() {
        while(!q.isEmpty()) {
            int a = q.poll();
            if (isVisited[a]) continue;
            isVisited[a] = true;
            System.out.print(a + " ");

            for (int i = 1; i <= n; i++) {
                if (!isVisited[i] && arr[a][i] > 0) {
                    q.offer(i);
                }
            }
        }
    }

    private static void dfs(int v) {
        isVisited[v] = true;
        System.out.print(v + " ");
        for (int i = 1; i <= n; i++) {
            if (!isVisited[i] && arr[v][i] > 0) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        isVisited = new boolean[n+1];
        for (int i = 0; i < m ; i++) {
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int desc = Integer.parseInt(st.nextToken());
            arr[src][desc]++;
            arr[desc][src]++;
        }
        dfs(v);

        System.out.println();
        isVisited = new boolean[n+1];

        q = new ArrayDeque<>();
        q.offer(v);
        bfs();
    }
}