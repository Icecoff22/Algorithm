package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c+32));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append((char)(c-32));
            }
        }
        System.out.println(sb.toString());
    }
}
