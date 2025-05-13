import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < operations.length; i++) {
            String[] tmpStr = operations[i].split(" ");
            if (tmpStr[0].equals("I")) {
                arr.add(Integer.parseInt(tmpStr[1]));
                arr.sort(null);
            }
            else if (tmpStr[0].equals("D") && !(arr.size() == 0)) {
                if (tmpStr[1].equals("1")) {
                    arr.remove(arr.size() - 1);
                }
                else if (tmpStr[1].equals("-1")) {
                    arr.remove(0);
                }
            }
        }
        
        if(arr.isEmpty()) {
            return new int[]{0, 0};
        }
        
        return new int[]{arr.get(arr.size() - 1), arr.get(0)};
    }
}