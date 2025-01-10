import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= a; i++) {
            String str = br.readLine();
            System.out.println(i + ". " + str);
        }
    }
}