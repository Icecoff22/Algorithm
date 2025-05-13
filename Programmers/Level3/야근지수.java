import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        long sum = 0;
        for (int i = 0; i < works.length; i++) {
            sum += works[i];
        }
        
        if (sum < n) {
            return 0;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {return o2 - o1;});
        
        for (int i = 0; i < works.length; i++) {
            pq.add(works[i]);
        }
        
        for (int i = 0; i < n; i++) {
            int tmp = pq.poll();
            tmp -= 1;
            if (tmp > 0) {
                pq.add(tmp);
            }
        }
        
        while (!pq.isEmpty()) {
            int tmp = pq.poll();
            answer += tmp * tmp;
        }
        
        return answer;
    }
}