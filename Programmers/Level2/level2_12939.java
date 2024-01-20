package Level2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level2_12939{
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String res = solution(str);
        System.out.println(res);
    }

    static String solution(String s){
        String answer = "";
        String arr[] = s.split(" ");
        int max, min, tmp;
        max = min = Integer.parseInt(arr[0]);
        for(int i=0;i<arr.length;i++){
            tmp = Integer.parseInt(arr[i]);
            if(tmp>max)
                max = tmp;
            if(tmp<min)
                min = tmp;
        }
        String res = min + " " + max;
        answer = res;
        return answer;
    }
}