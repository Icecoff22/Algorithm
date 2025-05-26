public class 기지국설치 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int coverage = 2 * w + 1;
        int start = 1; 

        for (int station : stations) {
            int left = station - w;
            int right = station + w;

            if (left > start) {
                int gap = left - start;
                answer += (gap + coverage - 1) / coverage;  
            }

            start = right + 1;
        }

        if (start <= n) {
            int gap = n - start + 1;
            answer += (gap + coverage - 1) / coverage;
        }

        return answer;
    }
}
