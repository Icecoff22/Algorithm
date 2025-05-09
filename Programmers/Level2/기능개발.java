package Programmers.Level2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();        
        Deque<Integer> dq = new ArrayDeque<>();
        int count = 0, sum = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            int div = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                div += 1;
            }
            dq.offer(div);
        }
        
        while(!dq.isEmpty()) {
            int tmp = dq.poll();
            count = 1;
            
            while(!dq.isEmpty()) {
                int tmpTmp = dq.poll();
                
                if (tmpTmp - tmp > 0) {
                    dq.addFirst(tmpTmp);
                    break;
                }
                
                count++;
            }
            answer.add(count);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
