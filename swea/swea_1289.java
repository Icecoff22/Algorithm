import java.util.Scanner;

public class swea_1289 {

    public static int solution(String str) {
        int count = 0;
        char prev = str.charAt(0);
        if (prev == '1') {
            count++;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != prev) {
                count++;
            }
            prev = str.charAt(i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            int res = solution(str);
            System.out.println("#" + (i+1) + " " + res);
        }
    }
}
