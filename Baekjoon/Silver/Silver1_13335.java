package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Silver1_13335 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Queue<Integer> trucks = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            trucks.add(Integer.parseInt(st.nextToken()));
        }

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < W; i++) {
            bridge.add(0);
        }

        int time = 0;
        int weightOnBridge = 0;
        while (!bridge.isEmpty()) {
            time++;
            weightOnBridge -= bridge.poll();

            if(trucks.isEmpty()) {
                continue;
            }

            if (trucks.peek() + weightOnBridge <= L) {
                int cur = trucks.poll();
                weightOnBridge += cur;
                bridge.add(cur);
            }else {
                bridge.add(0);
            }
        }

        System.out.println(time);

    }
}
