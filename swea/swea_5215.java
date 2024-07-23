import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_5215 {

    static int[][] arr;
    static int N, L, max;

    public static void solution(int cnt, int calSum, int tasteSum) {
        if (calSum > L)
            return;
        if (cnt == N) {
            if (calSum <= L)
                max = Math.max(max, tasteSum);
            return;
        }
        solution(cnt + 1, calSum + arr[cnt][1], tasteSum + arr[cnt][0]);

        solution(cnt + 1, calSum, tasteSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine()); //테스트케이스

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            arr = new int[N][2];
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            max = 0;
            solution(0, 0, 0);
            System.out.println("#" + (i + 1) + " " + max);
        }
    }
}
