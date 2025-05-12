import java.util.*;

class Solution {
    static boolean[] isChecked;

    public int solution(int n, int[][] computers) {
        isChecked = new boolean[n];
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            if (!isChecked[i]) {
                bfs(i, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void bfs(int k, int[][] computers) {
        Queue<Integer> q = new ArrayDeque<>();
        
        q.offer(k);
        
        while(!q.isEmpty()) {
            int a = q.poll();
            isChecked[a] = true;
            
            for (int i = 0; i < computers[a].length; i++) {
                if (!isChecked[i] && computers[a][i] == 1) {
                    q.offer(i);
                }
            }
        }
    }
}