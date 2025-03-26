import java.util.*;
import java.io.*;

public class Silver4_10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		Queue<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        while(q.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                q.offer(q.poll());
            }
            
            sb.append(q.poll() + ", ");
        }
        
        
        sb.append(q.poll() + ">");

		sb.append(">");
		System.out.println(sb.toString());
	}
}