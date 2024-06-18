import java.util.*;

class Solution {
    static char[][] charMaps;
    static boolean[][] checked;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public List<Integer> solution(String[] maps) {
        List<Integer> answer = new ArrayList<>();
        charMaps = new char[maps.length][maps[0].length()];
        checked = new boolean[maps.length][maps[0].length()];
        
        for (int i=0;i<maps.length;i++) {
            charMaps[i] = maps[i].toCharArray();
        }
        
        for (int i=0;i<charMaps.length;i++) {
            for (int j=0;j<charMaps[i].length;j++) {
                if (charMaps[i][j] != 'X' && !checked[i][j]) {
                    answer.add(bfs(i, j));
                }
            }
        }
        
        if(answer.size() == 0){
            answer.add(-1);
        }
        
        Collections.sort(answer);
        return answer;
    }
    
    public static int bfs(int x, int y){
        int sum = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        checked[x][y] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            sum += charMaps[cx][cy]-'0';
            for(int i=0;i<4;i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(nx < 0 || ny < 0 || nx >= charMaps.length || ny >= charMaps[0].length)
                    continue;
                if(!checked[nx][ny] && charMaps[nx][ny] != 'X'){
                    checked[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return sum;
    }
}