package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class common {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int res = (int) Math.sqrt(y-x);

            if (y - x == res * res) {
                System.out.println(res * 2 - 1);
            }
            else if (y - x <= res * (res + 1)) {
                System.out.println(res * 2);
            }
            else {
                System.out.println(res * 2 + 1);
            }
        }
    }
}
