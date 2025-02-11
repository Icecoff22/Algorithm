package Baekjoon.Bronze;

import java.io.*;
import java.util.*;

public class Bronze5_27294 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int result = 0;

		if (S == 1) {
			result = 280;

		} else {
			if (12 <= T && T <= 16) {
				result = 320;

			} else {
				result = 280;
			}
		}
		System.out.println(Integer.toString(result));
	}
}
