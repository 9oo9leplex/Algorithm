package programmers.kakaointern.level2;

public class 행렬테두리회전하기 {
/*
import java.util.*;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        
        int[][] map = new int[rows][columns];
        int idx = 1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                map[i][j] = idx++;
            }
        }
        
        int[] answer = new int[queries.length];
        
        int sr,sc,er,ec,r,c,tmp;
        idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        
        for(int[] query : queries){
            sr = query[0] - 1;
            sc = query[1] - 1;
            er = query[2] - 1;
            ec = query[3] - 1;
            
            r = er - sr;
            c = ec - sc;
            
            tmp = map[sr][sc];
            pq.add(tmp);
        
            // 왼쪽 행
            for(int i=0;i<r;i++) {
                map[sr+i][sc] = map[sr+i+1][sc];   
                pq.add(map[sr+i+1][sc]);
            }
            
            // 아래 열
            for(int i=0;i<c;i++) {
                map[er][sc+i] = map[er][sc+i+1];
                pq.add(map[er][sc+i+1]);
            }
            
            // 오른쪽 행
            for(int i=0;i<r;i++) {
                map[er-i][ec] = map[er-i-1][ec];
                pq.add(map[er-i-1][ec]);
            }
            
            // 위 열
            for(int i=0;i<c-1;i++) {
                map[sr][ec-i] = map[sr][ec-i-1];
                pq.add(map[sr][ec-i-1]);
            }
            map[sr][sc+1] = tmp;
            
            // System.out.println(pq);
            
            answer[idx++] = pq.poll();
            pq.clear();
        }
        
        return answer;
    }
}
 */
}
