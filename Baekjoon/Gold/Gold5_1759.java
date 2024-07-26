package day0725.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1759 {

    static char[] arr;

    static int L, C;
    static void solution(int cnt, int idx, String s) {
        if (cnt == L) {
            int aeiouCnt = 0, elseCnt = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') aeiouCnt++;
                else elseCnt++;
            }
            if (aeiouCnt > 0 && elseCnt > 1)
                System.out.println(s);
            return;
        }
        if (idx == C) return;

        solution(cnt + 1, idx + 1, s + arr[idx]);
        solution(cnt, idx + 1, s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[C];
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(arr);
        solution(0, 0, "");
    }

}
