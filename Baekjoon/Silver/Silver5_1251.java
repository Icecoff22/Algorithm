import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Silver5_1251 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();
        List<String> arr = new ArrayList<>();
        for (int a = 1; a < len; a++) {
            for (int b = a+1; b < len; b++) {
                arr.add(getWord(str, a, b));
            }
        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
    }

    public static String getWord(final String s, final int a, final int b) {
        StringBuilder str1 = new StringBuilder(s.substring(0, a));
        StringBuilder str2 = new StringBuilder(s.substring(a, b));
        StringBuilder str3 = new StringBuilder(s.substring(b));
        StringBuilder sb = new StringBuilder();
        sb.append(str1.reverse()).append(str2.reverse()).append(str3.reverse());
        return sb.toString();
    }
}