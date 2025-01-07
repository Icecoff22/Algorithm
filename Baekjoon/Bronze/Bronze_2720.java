import java.io.*;
import java.util.*;

public class Bronze_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int q = 0;
            int d = 0;
            int n = 0;
            int p = 0;
            
            q += x / 25;
            x -= q * 25;

            d += x / 10;
            x -= d * 10;

            n += x / 5;
            x -= n * 5;
            
            p = x / 1;

            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}
