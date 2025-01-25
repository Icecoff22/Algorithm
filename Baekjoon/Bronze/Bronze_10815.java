import java.io.*;
import java.util.*;

public class Bronze_10815 {
    public static void main(String[] args) throws IOException {
        Map<Integer, Boolean> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            map.put(x, true);
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (map.get(x) == null) {
                System.out.print("0 ");
            }
            else {
                System.out.print("1 ");
            }
        }

    }
}
