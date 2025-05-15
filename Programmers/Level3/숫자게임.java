import java.util.Arrays;

public class 숫자게임 {
    public int solution(int[] A, int[] B) {
        int aIdx = 0, bIdx = 0;
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        while (aIdx != A.length && bIdx != B.length) {
            if (A[aIdx] < B[bIdx]) {
                answer++;
                aIdx++;
                bIdx++;
            }
            else {
                bIdx++;
            }
        }

        return answer;
    }
}
