package programmers.kakaointern.level2;

public class 거리두기확인하기 {
/*
import java.util.*;

class Solution {
    
    static class Node {
        int r,c,d,fr,fc;
        
        public Node(int r, int c, int d, int fr, int fc){
            this.r = r;
            this.c = c;
            this.d = d;
            this.fr = fr;
            this.fc = fc;
        }
        
        @Override
        public String toString(){
            return "Node[r,c,d,fr,fc]: ["+r+","+c+","+d+","+fr+","+fc+"]";
        }
    }
    
    static char[][] map;
    static Queue<Node> q;
    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    
    public int[] solution(String[][] places) {
        
        int len = 5;
        map = new char[len][len];
        q = new LinkedList<>();
        char c;
        int[] answer = new int[5];
            
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                for(int k=0;k<len;k++){
                    
                    c = places[i][j].charAt(k);                    
                    map[j][k] = c;
                    if(c == 'P') q.add(new Node(j,k,0,j,k));
                }
            }
            answer[i] = bfs();
            // System.out.println(q.size());
            q.clear();
        }
        return answer;
    }
    
    static int bfs(){
        // System.out.println("시작");
        
        // for(int i=0;i<5;i++) System.out.println(Arrays.toString(map[i]));
        
        Node cur;
        int nr,nc;
        boolean[][] visit = new boolean[5][5];
        
        while(!q.isEmpty()){
            
            cur = q.poll();
            visit[cur.r][cur.c] = true;
            if(cur.d == 2) continue;
            // System.out.println(q);
            // System.out.println(cur);
            for(int i=0;i<4;i++){
                nr = cur.r + dr[i];
                nc = cur.c + dc[i];
                // System.out.println("[nr,nc]: ["+nr+","+nc+"]");
                
                if(!inArea(nr,nc) || map[nr][nc] == 'X' || (cur.fr == nr && cur.fc == nc)) continue;
                if(map[nr][nc] == 'P') {
                    // System.out.println("종료 조건 [nr,nc,map]: ["+nr+","+nc+","+map[nr][nc]+"]");
                    return 0;
                }
                
                q.add(new Node(nr,nc,cur.d+1,cur.fr,cur.fc));
                
            }
        }
        return 1;
    }
     
    static boolean inArea(int nr, int nc){
        return nr >= 0 && nr < 5 && nc >= 0 && nc < 5;
    }
}
 */
}
