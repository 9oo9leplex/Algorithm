package programmers.코딩테스트연습.level3.깊이너비우선탐색;

public class 단어변환 {
/*
import java.util.*;
class Solution {
    
    static int answer;
    static int size;
    
    public int solution(String begin, String target, String[] words) {
        
        boolean flag = true;
        for(String word : words) {
            if(word.equals(target)){
                flag  = false;
                break;
            }
        } 
        if(flag) return 0;
        
        int len = words.length;
        answer = Integer.MAX_VALUE;
        size = begin.length();
        dfs(begin,target,words, new boolean[len],0,len);
        
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    
    private static void dfs(String begin, String target, String[] words, boolean[] visit, int cnt, int len){
        
        System.out.println("[str,cnt,len]: "+"["+begin+","+cnt+","+len+"]");
        if(begin.equals(target)) {
            answer = Math.min(answer,cnt);
            return;
        }
        else if(cnt == len) return;
        
        
        int diff;
        for(int i=0;i<len;i++){
            if(visit[i]) continue;
            diff = 0;
            for(int j=0;j<size;j++) if(begin.charAt(j) != words[i].charAt(j)) diff++;
            // System.out.println("[begin,word,diff]: ["+begin+","+words[i]+","+diff+"]");
            if(diff > 1) continue;
            
            visit[i] = true;
            dfs(words[i],target,words,visit,cnt+1,len);
            visit[i] = false;
        }
          
    }
}





 */
}
