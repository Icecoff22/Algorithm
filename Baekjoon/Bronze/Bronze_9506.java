import java.io.*;
import java.util.*;

public class Bronze_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == -1)
                break;

            // 약수를 담아 둘 list
            ArrayList<Integer> list = new ArrayList<>();
            // 조건에 부합하는지
            int sum = 0;

            for(int i = 1; i < N; i++){
                // 약수라면 list에 추가하고 합을 구한다.
                if(N % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            st.append(N);
            if(N == sum) {
                st.append(" = ");
                for (int i = 0; i < list.size()-1; i++)
                    st.append(list.get(i) + " + ");
                st.append(list.get(list.size()-1));
            }
            else
                st.append(" is NOT perfect.");
            st.append("\n");
        }

        System.out.print(st);
        br.close();
    }
}
