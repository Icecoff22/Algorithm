package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class common {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        String[][] arrStr = new String[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();
            arrStr[i] = tmp.split("\\.");
            if (arrStr[i][0].length() == tmp.length()) {
                arr[i][0] = Integer.parseInt(arrStr[i][0]);
                arr[i][1] = -1;
                continue;
            }
            arr[i][0] = Integer.parseInt(arrStr[i][0]);
            arr[i][1] = Integer.parseInt(arrStr[i][1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return Integer.compare(o1[0], o2[0]);
                }
                else if (o1[1] == -1) {
                    return o2[1];
                }
                else if (o2[1] == -1) {
                    return o1[1];
                }

                return Integer.compare(o1[1], o2[1]);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + "." + arr[i][1]);
        }

    }
}
