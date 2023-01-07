package programmers.코딩테스트연습.level2.완전탐색;

public class 전력망을둘로나누기 {
/*
import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        
        int[][] map = new int[n][n];
        for(int[] wire : wires){
            map[wire[0]-1][wire[1]-1] = 1;
            map[wire[1]-1][wire[0]-1] = 1;
        }
        
        int len = wires.length;
        int a,b,cnt1,cnt2;
        // for(int i=0;i<n;i++) System.out.println(Arrays.toString(map[i]));
        
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        int answer = Integer.MAX_VALUE;
        
        for(int[] wire : wires){
            a = wire[0]-1;
            b = wire[1]-1;
            map[a][b] = 0;
            map[b][a] = 0;
            
            cnt1 = simulate(a,map,n);
            cnt2 = simulate(b,map,n);
            
            // System.out.println("[cnt1,cnt2]: ["+cnt1+","+cnt2+"]");
            answer = Math.min(answer, Math.abs(cnt1-cnt2));
            
            map[a][b] = 1;
            map[b][a] = 1;
        }
        
        return answer;
    }
    
    private static int simulate(int start, int[][] map, int n){
        
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[n];
        visit[start] = true;
        q.add(start);
        
        int cur, cnt = 1;
        while(!q.isEmpty()){
            cur = q.poll();
            
            for(int i=0;i<n;i++){
                if(map[cur][i] == 1 && !visit[i]) {
                    visit[i] = true;
                    q.add(i);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
 */
}
