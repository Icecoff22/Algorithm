import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver2_1058 {
    public static void main(String[] args) throws IOException {
        int[][] arr;
        boolean[][] checked;
        int max = 0, sum = 0;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        checked = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();

            for (int j = 0; j < n; j++) {
                if (line.charAt(j) == 'Y') {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    checked[i][j] = true;
                    for (int k = 0; k < n; k++) {
                        if (arr[j][k] == 1 && i != k) {
                            checked[i][k] = true;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                if (checked[i][j]) {
                    sum ++;
                }
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}