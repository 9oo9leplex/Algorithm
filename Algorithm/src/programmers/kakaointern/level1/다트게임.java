package programmers.kakaointern.level1;

public class 다트게임 {
/*
import java.util.*;
class Solution {
    public int solution(String dartResult) {
        
        int len = dartResult.length(),start = 0;
        int first,tmp = 0,now = 0, answer = 0;
        char second, third;
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('S',1);  hm.put('D',2);  hm.put('T',3);
        
        while(true){
            if(start >= len) break;
            
            if(start + 2 < len && 
               (dartResult.charAt(start+2) == '*' || 
                dartResult.charAt(start+2) == '#'))
            {
               
                first = dartResult.charAt(start) - '0';
                second = dartResult.charAt(start+1);
                third = dartResult.charAt(start+2);
                start += 3;
                
                tmp = now;
                now = (int)Math.pow(first,hm.get(second));
                
                if(third == '#') now = -(now);
                else {
                    now *= 2;
                    answer += tmp;
                    // now += tmp;
                }
                
                answer += now;
                
                // start += 3;
            }
            else if(start + 3 < len && 
               (dartResult.charAt(start+3) == '*' || 
                dartResult.charAt(start+3) == '#'))
            {
                first = 10;
                second = dartResult.charAt(start+2);
                third = dartResult.charAt(start+3);
                start += 4;
                
                tmp = now;
                now = (int)Math.pow(first,hm.get(second));
                
                if(third == '#') now = -(now);
                else {
                    now *= 2;
                    answer += tmp;
                    // now += tmp;
                }
                
                answer += now;
            }
            else {
                
                first = dartResult.charAt(start) - '0';
                second = dartResult.charAt(start+1);
                if(second == '0'){
                    first = 10;
                    second = dartResult.charAt(start+2);
                    start += 3;
                } else{
                    start += 2;
                }
                
                tmp = now;
                now = (int)Math.pow(first,hm.get(second));
                
                answer += now;
                
            }
            // System.out.println("[tmp,now,answer]: ["+tmp+","+now+","+answer+"]");
        }
        
        return answer;
    }
}
 */
}
