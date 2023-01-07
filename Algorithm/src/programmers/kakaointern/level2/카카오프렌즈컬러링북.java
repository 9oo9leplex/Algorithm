package programmers.kakaointern.level2;

public class 카카오프렌즈컬러링북 {
/*
import java.util.*;
class Solution {
    
    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    static class Node {
        int r,c,i;
        
        public Node(int r, int c, int i){
            this.r = r;
            this.c = c;
            this.i = i;
        }
        
        @Override
        public String toString(){
            return "Node[" + r+","+c+","+i+"]";
        }
    }
    
    public int[] solution(int m, int n, int[][] picture) {
        
        boolean[][] visit = new boolean[m][n];
        Queue<Node> q = new LinkedList<>();
        int numberOfArea = 0, nr,nc;
        int maxSizeOfOneArea = 0,max;
        Node cur;
        
        // for(int i=0;i<m;i++) System.out.println(Arrays.toString(picture[i]));
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(picture[i][j] == 0 || visit[i][j]) continue;
                
                q.add(new Node(i,j,picture[i][j]));
                visit[i][j] = true;
                numberOfArea++;
                max = 1;
                
                while(!q.isEmpty()){
                    cur = q.poll();
                    // System.out.println(cur);
                    for(int k=0;k<4;k++){
                        nr = cur.r + dr[k];
                        nc = cur.c + dc[k];
                        
                        if(inArea(nr,nc,m,n) && picture[nr][nc] == cur.i && !visit[nr][nc]){
                            q.add(new Node(nr,nc,cur.i));
                            visit[nr][nc] = true;
                            max++;
                        }
                    }
                }
                maxSizeOfOneArea = Math.max(max,maxSizeOfOneArea);
            }
        }
        
        // System.out.println(numberOfArea+", "+maxSizeOfOneArea);

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    private static boolean inArea(int nr, int nc, int r, int c){
        return nr >= 0 && nr < r && nc >= 0 && nc < c;
    }
}
 */
}
