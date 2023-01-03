package programmers.kakaointern.level2;

public class 프렌즈4블록 {
/*
import java.util.*;
class Solution {
    
    static class Node implements Comparable<Node> {
        int r,c;
        char target;
        
        public Node(int r, int c, char target){
            this.r = r;
            this.c = c;
            this.target = target;
        }
        
        @Override
        public int compareTo(Node o){
            return o.r - this.r;
        }
    }
    
    
    public int solution(int m, int n, String[] board) {
        
        char map[][] = new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map[i][j] = board[i].charAt(j);
            }
        }
        
        boolean[][] visit = new boolean[m][n];
        
        char target;
        int nr,nc,answer = 0;
        boolean flag, bunri;
        // Queue<Node> empty = new LinkedList<>();
        // Queue<Node> block = new LinkedList<>();
        PriorityQueue<Node> empty = new PriorityQueue<>();
        PriorityQueue<Node> block = new PriorityQueue<>();
        Node e,t;
        
        // for(int i=0;i<m;i++)
        //     System.out.println(Arrays.toString(map[i]));
        // System.out.println();
        
        while(true){
        // for(int k=0;k<5;k++){
            
        
            flag = false;
            for(int i=0;i<m-1;i++){
                for(int j=0;j<n-1;j++){

                    target = map[i][j];
                    if(target == ' ') continue;
                    // if(target != board[i].charAt(j+1)) continue;
                    // if(target != board[i+1].charAt(j)) continue;
                    // if(target != board[i+1].charAt(j+1)) continue;
                    if(target != map[i][j+1]) continue;
                    if(target != map[i+1][j]) continue;
                    if(target != map[i+1][j+1]) continue;

                    visit[i][j] = true; visit[i][j+1] = true;
                    visit[i+1][j] = true; visit[i+1][j+1] = true;
                    flag = true;
                }
            }

            if(!flag) return answer;

            for(int i=0;i<n;i++){
                bunri = false;
                for(int j=m-1;j>=0;j--){
                    if(visit[j][i]) {
                        bunri = true;
                        empty.add(new Node(j,i,map[j][i]));
                        map[j][i] = ' ';
                    }
                    else if(bunri) {
                        block.add(new Node(j,i,map[j][i]));
                    }
                }

                while(!block.isEmpty()){
                    e = empty.poll();
                    t = block.poll();

                    map[e.r][e.c] = t.target;
                    map[t.r][t.c] = ' ';
                    empty.add(new Node(t.r,t.c,t.target));
                }

                empty.clear();
            }


            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(visit[i][j]) answer++;
                }
                Arrays.fill(visit[i],false);
                // System.out.println(Arrays.toString(map[i]));
            }
            // System.out.println();
        }
        // return 0;
    }
}
 */
}
