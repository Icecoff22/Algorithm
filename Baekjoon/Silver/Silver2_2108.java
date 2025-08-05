package codingTest;

import java.io.*;
import java.util.*;

public class common {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        List<Integer> arr = new ArrayList<>();
        int[] arr2 = new int[8001];
        List<int[]> arr2List = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            sum += tmp;
            arr.add(tmp);
            arr2[tmp + 4000]++;
        }

        arr.sort((Comparator.comparingInt(o -> o)));

        for (int i = 0; i < 8001; i++) {
            if (arr2[i] == 0) {
                continue;
            }

            arr2List.add(new int[]{i - 4000, arr2[i]});
        }

        arr2List.sort((o1, o2) ->
                {
                    if (o1[1] == o2[1]) {
                        return o1[0] - o2[0];
                    }
                    return o2[1] - o1[1];
                }
        );


        System.out.println(Math.round((float) sum / N));
        System.out.println(arr.get(N / 2));

        if (arr2List.size() != 1) {
            if (arr2List.get(0)[1] == arr2List.get(1)[1]) {
                System.out.println(arr2List.get(1)[0]);
            }
            else {
                System.out.println(arr2List.get(0)[0]);
            }
        }
        else {
            System.out.println(arr.get(0));
        }


        int max = arr.get(N - 1);
        int min = arr.get(0);
        System.out.println(max - min);
    }
}