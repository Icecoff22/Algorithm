package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1260_2 {
    static List<List<Integer>> arr; //이거 대신 LinkedList[] adjList; 이런식도 됨.
    static boolean[] isVisited;
    static int n, m, v;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        arr = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            List<Integer> list = new ArrayList<>();
            arr.add(list);
        }
        isVisited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int desc = Integer.parseInt(st.nextToken());
            arr.get(src).add(desc);
            arr.get(desc).add(src);
        }

        for (List<Integer> element : arr) {
            Collections.sort(element);
        }

        sb = new StringBuilder(v + " ");
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        dfs(stack);
        System.out.println(sb.toString());

        sb = new StringBuilder();
        isVisited = new boolean[n+1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(v);
        bfs(queue);
        System.out.println(sb.toString());
    }
    private static void dfs(Stack<Integer> stack) {

        while (!stack.isEmpty()) {
            boolean flag = false;
            int a = stack.peek();
            isVisited[a] = true;

            for (int i = 0; i < arr.get(a).size(); i++) {
                if (!isVisited[arr.get(a).get(i)]) {
                    sb.append(arr.get(a).get(i) + " ");
                    stack.push(arr.get(a).get(i));
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                stack.pop();
            }
        }
    }

    private static void bfs(Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            int a = queue.poll();
            if (!isVisited[a]) {
                sb.append(a + " ");
                isVisited[a] = true;
            }
            for (int i = 0; i < arr.get(a).size(); i++) {
                if (!isVisited[arr.get(a).get(i)]) {
                    queue.offer(arr.get(a).get(i));
                }
            }
        }
    }
}
