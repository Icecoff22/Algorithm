package Baekjoon.Gold;

import java.util.*;
import java.io.*;

public class Gold4_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 오름차순 정렬
        int count = 0;

        for (int k = 0; k < N; k++) {
            int target = arr[k];
            int left = 0, right = N - 1;

            while (left < right) {
                if (left == k) {
                    left++;
                    continue;
                }
                if (right == k) {
                    right--;
                    continue;
                }

                int sum = arr[left] + arr[right];

                if (sum == target) {
                    count++;
                    break;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println(count);
    }
}
