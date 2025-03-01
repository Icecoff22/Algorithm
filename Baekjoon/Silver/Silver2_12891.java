package Baekjoon.Silver;

import java.util.*;
import java.io.*;

public class Silver2_12891 {

    static int[] cnt = new int[4];
    static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[] arr = new int[4];
        int count = 0;
        boolean flag = false;

        st = new StringTokenizer(br.readLine());
        str = st.nextToken();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < P; i++) {
            if (str.charAt(i) == 'A') {
                cnt[0]++;
            }
            if (str.charAt(i) == 'C') {
                cnt[1]++;
            }
            if (str.charAt(i) == 'G') {
                cnt[2]++;
            }
            if (str.charAt(i) == 'T') {
                cnt[3]++;
            }
        }

        for (int j = 0; j < 4; j++) {
            if (arr[j] > cnt[j]) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            count++;
        }

        for (int i = 1; i <= S - P; i++) {
            flag = false;
            modifyCntArr(str.charAt(i - 1), false);
            modifyCntArr(str.charAt(i + P - 1), true);

            for (int j = 0; j < 4; j++) {
                if (arr[j] > cnt[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void modifyCntArr(char ch, boolean isAdd) {
        if (ch == 'A') {
            if (isAdd) {
                cnt[0]++;
            }
            else {
                cnt[0]--;
            }
        }
        if (ch == 'C') {
            if (isAdd) {
                cnt[1]++;
            }
            else {
                cnt[1]--;
            }
        }
        if (ch == 'G') {
            if (isAdd) {
                cnt[2]++;
            }
            else {
                cnt[2]--;
            }
        }
        if (ch == 'T') {
            if (isAdd) {
                cnt[3]++;
            }
            else {
                cnt[3]--;
            }
        }
    }
}
