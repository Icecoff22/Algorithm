class Solution {
    public int[] solution(int n, long left, long right) {
        int arrCount = 0;
        int[] answer = new int[(int)(right - left + 1L)];
        for (long i = left; i <= right; i++) {
            answer[arrCount] = ((i / n) > (i % n)) ? (int)((i / n) + 1) : (int)(i % n + 1);
            arrCount++;
        }
       
        
        return answer;
    }
}