class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] arr = new int[n + 1][m + 1];
        
        for (int i = 0; i < puddles.length; i++) {
            int row = puddles[i][1];
            int col = puddles[i][0];
            
            arr[row][col] = -1;
        }
        
        arr[1][1] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                    continue;
                }
                else {
                    arr[i][j] += (arr[i][j - 1] + arr[i - 1][j]) % 1_000_000_007;
                }
            }
        }
        
        return arr[n][m];
    }
}