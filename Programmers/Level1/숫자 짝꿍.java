class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        char[] char_x_arr = X.toCharArray();
        char[] char_y_arr = Y.toCharArray();
        int x_cnt_arr[] = new int[10];
        int y_cnt_arr[] = new int [10];
        int min_cnt_arr[] = new int [10];
        int total_cnt = 0;
        
        
        for (int i=0; i<char_x_arr.length;i++) {
            x_cnt_arr[char_x_arr[i]-'0']++;
        }
        for (int i=0; i<char_y_arr.length;i++) {
            y_cnt_arr[char_y_arr[i]-'0']++;
        }
        
        for (int i=0;i<10;i++) {
            if (x_cnt_arr[i] >= y_cnt_arr[i]) {
                min_cnt_arr[i] = y_cnt_arr[i];
            }
            else {
                min_cnt_arr[i] = x_cnt_arr[i];
            }
            total_cnt += min_cnt_arr[i];
        }
        
        if (total_cnt==0) {
            answer = "-1";
            return answer;
        }
        
        if (total_cnt == min_cnt_arr[0]) {
            answer = "0";
            return answer;
        }
        for (int i=9; i>=0;i--) {
            String num = String.valueOf(i).repeat(min_cnt_arr[i]);
            answer += num;
        }
        
        return answer;
    }
}