package codingTest;

import java.util.Scanner;

public class BJ_1463 {
    static int count = 0;
    static int arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];
        arr[1] = 0;
        if (n == 2 || n==3) {
            System.out.println(1);
            return;
        }
        arr[2] = 1;
        arr[3] = 1;
        solution(n);
        System.out.println(arr[n]);
    }

    public static void solution(int n) {
        for (int i = 4; i <= n; i++) {
            if (n % 3 ==0 && n % 2 == 0) {
                arr[n] = Math.min(arr[n-1], Math.min(arr[n%2], arr[n%3])) + 1;
            }
            else if (n % 3 ==0) {
                arr[n] = Math.min(arr[n-1], arr[n%3]) + 1;
            }
            else if (n%2==0) {
                arr[n] = Math.min(arr[n-1], arr[n%2]) + 1;
            }
            else {
                arr[n] = arr[n-1] + 1;
            }
        }
    }

}
