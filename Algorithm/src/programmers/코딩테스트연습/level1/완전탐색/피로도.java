package programmers.코딩테스트연습.level1.완전탐색;

public class 피로도 {
/*
import java.util.*;
class Solution {
    
    static boolean[] visit;
    static int answer, numbers[];
    
    public int solution(int k, int[][] dungeons) {
        
        // Arrays.sort(dungeons, (o1,o2) -> o2[0] - o1[0]);
        int len = dungeons.length;
        visit = new boolean[len];
        numbers = new int[len];
        // for(int i=0;i<len;i++) System.out.println(Arrays.toString(dungeons[i]));
        answer = 0;
        
        // for(int[] dungeon : dungeons){
        //     if(dungeon[0] > k) continue;
        //     k -= dungeon[1];
        //     answer++;
        // }
        
        persu(0,len,dungeons,k);
        
        return answer;
    }
    
    private static void persu(int cnt, int len, int[][] dungeons, int k){
        
        if(cnt == len){
            int dungeon = 0;
            for(int num : numbers){
                if(k < dungeons[num][0]) continue;
                dungeon++;
                k -= dungeons[num][1];
            }
            
            answer = Math.max(answer,dungeon);
            return;
        }
        
        for(int i=0;i<len;i++){
            if(visit[i]) continue;
            visit[i] = true;
            numbers[cnt] = i;
            persu(cnt+1,len,dungeons,k);
            visit[i] = false;
        }
    }
}
 */
}
