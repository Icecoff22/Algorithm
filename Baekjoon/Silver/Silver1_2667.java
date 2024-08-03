package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_2667 {
    static int n, eachCount = 1;
    static List<Integer> countList = new ArrayList<>();
    static boolean[][] arr;
    static boolean[][] isVisited;
    static int[] x = {0, 1, 0, -1};
    static int[] y = {1, 0, -1, 0};

    static class Point {
        int i;
        int j;

        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new boolean[n][n];
        isVisited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            char[] str = br.readLine().toCharArray();

            for (int j = 0; j < n; j++) {
                if (str[j] - '0' > 0) {
                    arr[i][j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isVisited[i][j]) continue;
                if (arr[i][j]) {
                    bfs(new Point(i, j));
                    count++;
                    countList.add(eachCount);
                    eachCount = 1;
                }
            }
        }
        System.out.println(count);
        countList.stream().sorted().forEach(System.out::println);
        
    }

    public static void bfs(Point p) {
        Queue<Point> q = new ArrayDeque<>();
        q.offer(p);
        isVisited[p.i][p.j] = true;

        while (!q.isEmpty()) {
            Point np = q.poll();

            for (int i = 0; i < 4; i++) {
                int ax = np.i + x[i];
                int ay = np.j + y[i];

                if (ax >= 0 && ax < n && ay >= 0 && ay < n && !isVisited[ax][ay] && arr[ax][ay]){
                    eachCount++;
                    q.offer(new Point(ax,ay));
                    isVisited[ax][ay] = true;
                }
            }

        }
    }
}