package programmers.코딩테스트연습.level2.깊이너비우선탐색;

public class 게임맵최단거리 {
/*
import java.util.*;
class Solution {
    
    static class Node implements Comparable<Node>{
        int r,c,d;
        
        public Node(int r, int c, int d){
            this.r = r;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public String toString(){
            return "[r,c,d]: ["+this.r+","+this.c+","+this.d+"]";
        }
        
        @Override
        public int compareTo(Node o){
            return this.d - o.d;
        }
    }
    
    public int solution(int[][] maps) {
        
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        
        Queue<Node> q = new PriorityQueue<>();
        Node cur;
        int nr,nc;
        int r = maps.length;
        int c = maps[0].length;
        
        boolean[][] visit = new boolean[r][c];
        visit[0][0] = true;
        
        q.add(new Node(0,0,0));
        while(!q.isEmpty()){
            cur = q.poll();
            // System.out.println(cur);
            if(cur.r == r-1 && cur.c == c-1 ) return cur.d + 1;
            
            for(int i=0;i<4;i++){
                nr = cur.r + dr[i];
                nc = cur.c + dc[i];
                
                if(inArea(nr,nc,r,c) && maps[nr][nc] != 0 && !visit[nr][nc]){
                    visit[nr][nc] = true;
                    q.add(new Node(nr,nc,cur.d+1));
                }
            }
        }
        
        return -1;
    }
    
    private static boolean inArea(int nr, int nc, int r, int c){
        return nr >= 0 && nr < r && nc >= 0 && nc < c;
    }
}








 */
}
