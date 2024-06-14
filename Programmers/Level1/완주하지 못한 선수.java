import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();

        for (String player : participant) {
            int tmp = participantMap.getOrDefault(player, 0);
            if (tmp == 0) {
                participantMap.put(player, 1);
                continue;
            }
            participantMap.put(player, tmp + 1);
        }

        for (String completionPlayer : completion) {
            participantMap.put(completionPlayer, participantMap.get(completionPlayer)-1);
        }

        for (String player : participantMap.keySet()) {
            if (participantMap.get(player) != 0) {
                return player;
            }
        }
        return null;
    }
}