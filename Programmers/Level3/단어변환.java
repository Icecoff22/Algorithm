import java.util.*;

class Solution {
    
    static boolean[] isChecked;
    static String[] arr;
    static int min = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        isChecked = new boolean[words.length + 1];
        arr = new String[words.length + 1];
        arr[0] = begin;
        
        for (int i = 1; i < arr.length; i++) {
            arr[i] = words[i - 1];
        }
        
        bfs(new int[]{0, 0}, target);
            
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        
        return min;
    }
    
    public void bfs(int[] src, String target) {
        Deque<int[]> d = new ArrayDeque<>();        
        d.offer(src);
        
        while(!d.isEmpty()) {
            int[] a = d.poll();
            isChecked[a[0]] = true;
            
            if (arr[a[0]].equals(target)) {
                if (min > a[1]) {
                    min = a[1];    
                }
            }
            
            for (int i = 1; i < arr.length; i++) {
                String s1 = arr[a[0]];
                String s2 = arr[i];
                int count = 0;

                if (isChecked[i]) continue;
                
                for (int k = 0; k < s1.length(); k++) {
                    if (s1.charAt(k) != s2.charAt(k)) {
                        count++;
                    }
                }
                if (count == 1) {
                    d.offer(new int[]{i, a[1] + 1});
                }
            }
        }
    }
}