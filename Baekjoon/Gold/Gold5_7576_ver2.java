package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_7576_ver2 {
    static int[][] map;
    static int M, N; // M: 가로 = j, N: 세로 = i

    static int[] di = {1, -1, 0, 0};
    static int[] dj = {0, 0, 1, -1};
    static class Tomato {
        int i, j;

        Tomato(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        Queue<Tomato> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) { // 처음부터 익어있는 토마토 큐에 담자!
                    q.add(new Tomato(i, j));
                }
            }
        }

        int day = 0;
        //BFS 탐색으로 익은 토마토가 주변에 익힐 토마토를 찾아서 큐에 넣기!
        while (!q.isEmpty()) {
            int size = q.size(); // dqy 일차에 익어있는 토마토들

            for (int s=0; s < size; s++) { //day 일차에 익어있는 토마토 갯수 미리 세어놨으니 그만큼만 poll 할래요.
                Tomato tomato = q.poll();
                for (int d = 1; d < 4; d++) {
                    int nexti = tomato.i + di[d];
                    int nextj = tomato.j + dj[d];
                    if (nexti >=0 && nexti<N && nextj>=0 && nextj < M && map[nexti][nextj] == 0) {
                        q.add(new Tomato(nexti, nextj));
                        map[nexti][nextj] = 1;
                    }
                }
            }
            if (q.isEmpty()) { // 큐에 남은 애들이 다음날 익는다고 day++하던건데 다음날 익는 토마토가 없으면 day++ 안해야지
                break;
            }
            day ++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    day = -1;
                }
            }
        }
        System.out.println(day);
    }
}
