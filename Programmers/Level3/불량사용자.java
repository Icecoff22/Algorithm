import java.util.*;
class Solution {
    
    static String[] userIds, bannedIds;
    static Set<Set<String>> result = new HashSet<>();
    
    public int solution(String[] user_id, String[] banned_id) {
        userIds = user_id;
        bannedIds = banned_id;
        
        dfs(new HashSet<>(), 0);
        
        return result.size();
    }
    
    public void dfs(Set<String> set, int index) {
        if (index == bannedIds.length) {
            result.add(set);
            return;
        }
        
        for (int i = 0; i < userIds.length; i++) {
            if(set.contains(userIds[i])) {
                continue;
            }
            
            if (checkAlgo(userIds[i], bannedIds[index])) {
                set.add(userIds[i]);
                dfs(new HashSet<>(set), index + 1);
                set.remove(userIds[i]);
            }
        }
    }
    
    public boolean checkAlgo(String userId, String bannedId) {
        if (userId.length() != bannedId.length()) {
            return false;
        }
        
        boolean flag = false;
        
        for (int i = 0; i < userId.length(); i++) {
            if (bannedId.charAt(i) == '*') {
                continue;
            }
            if (userId.charAt(i) != bannedId.charAt(i)) {
                flag = true;
                break;
            }
        }
        
        if (flag) {
            return false;
        }
        return true;
    }
}