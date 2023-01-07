package programmers.코딩테스트연습.level2.완전탐색;

public class 모음사전 {
/*
import java.util.*;
class Solution {
    
    static boolean[] visit;
    static char[] arr= {'A','E','I','O','U'};
    static List<String> list;
    
    public int solution(String word) {

        list = new ArrayList<>();
        for(int i=1;i<=5;i++) {
            visit = new boolean[i];
            persu(0,i,"");
        }
        
        Collections.sort(list);
        return list.indexOf(word) + 1;
    }
    
    private static void persu(int cnt, int limit, String str){
        
        if(cnt == limit) {
            // System.out.println("str: "+str);
            list.add(str);
            return;
        }
        
        for(int i=0;i<5;i++){
        //     if(visit[i]) continue;
        //     visit[i] = true;
            persu(cnt+1,limit,str + arr[i]);
        //     visit[i] = false;
        }
    }
}




 */
}
