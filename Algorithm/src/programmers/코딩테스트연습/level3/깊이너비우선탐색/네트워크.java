package programmers.코딩테스트연습.level3.깊이너비우선탐색;

public class 네트워크 {
/*
import java.util.*;
class Solution {
    
    public int solution(int n, int[][] computers) {
        
        int r = computers.length;
        int c = computers[0].length;
        
        boolean[] visit = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        
        int answer = 0;
        int cur;
        
        for(int i=0;i<r;i++){
            if(visit[i]) continue;
            
            visit[i] = true;
            q.add(i);
            answer++;
            
            while(!q.isEmpty()){
                cur = q.poll();
                    for(int j=0;j<c;j++){
                    if(cur != j && computers[cur][j] == 1 && !visit[j]){
                        visit[j] = true;
                        q.add(j);
                    }
                }
            }
            
        }
        
        return answer;
    }
}













 */
}
