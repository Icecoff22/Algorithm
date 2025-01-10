import java.util.*;
import java.io.*;

public class Bronze_5086 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());

            if (a1 == 0 && a2 == 0) {
                break;
            }

            if (a2 % a1 == 0) {
                System.out.println("factor");
            }
            
            else if (a1 % a2 == 0) {
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }
        }
    }
}