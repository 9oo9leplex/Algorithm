package programmers.kakaointern.level1;

public class 숫자문자열과영단어 {
/*
import java.util.*;
class Solution {
    public int solution(String s) {
        
        String tmp = "";
        String answer = "";
        HashMap<String,String> hm = new HashMap<>();
        
        hm.put("zero","0");   hm.put("one","1");   hm.put("two","2");
        hm.put("three","3");   hm.put("four","4");   hm.put("five","5");
        hm.put("six","6");   hm.put("seven","7");   hm.put("eight","8");
        hm.put("nine","9");   
        
        
        for(char c : s.toCharArray()){
            if(c - '0' >= 0 && c - '0' <= 9) {
                if(!tmp.equals("")){
                    answer += hm.get(tmp);   
                    tmp = "";
                }
                answer += c;
            } 
            else {
                if(hm.containsKey(tmp)) {
                    answer += hm.get(tmp);
                    tmp = "";
                }
                tmp += c;
            }
        }
        
        if(!tmp.equals("")) answer += hm.get(tmp);
        
        // System.out.println(answer);
        // int result = Integer.parseInt(answer);
        // return result;
        return Integer.parseInt(answer);
    }
}
 */
}
