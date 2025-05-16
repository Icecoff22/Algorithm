class Solution {
    public int[] solution(int n, int s) {
        if (n > s) {
            return new int[]{-1};
        }
        
        int div = s / n;
        int rem = s % n;
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = div;
        }
        
        for (int i = arr.length - 1; rem > 0; i--) {
            arr[i]++;
            rem--;
        }
        
        return arr;
    }
}