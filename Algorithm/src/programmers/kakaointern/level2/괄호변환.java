package programmers.kakaointern.level2;

public class 괄호변환 {
/*
import java.util.*;
class Solution {
    public String solution(String p) {
        
        if(isRight(p)) return p;
        
        return split(p);
    }
    
    static private String convert(String u, String v){
        String str = "(";
        
        // System.out.println("[u,v]: ["+u+","+v+"]");
        str += split(v) + ")";
        u = u.substring(1,u.length()-1);
        // System.out.println("[str,u,v]: ["+str+","+u+","+v+"]");
        
        for(char c : u.toCharArray()) {
            if(c == ')') str += '(';
            else str += ')';
        }
        // System.out.println("convert str: " + str);
        return str;
    }
    
    static private String split(String arr){
        
        String str = "", result = "";
        int sum = 0, idx = 0;
        
        for(char c : arr.toCharArray()){
            if(c == '(') sum++;
            else sum--;
            
            str += c;
            idx++;
            
            if(sum == 0) {
                if(isRight(str)) {
                    result += str;
                    // System.out.println("split right result: "+result);
                    result += split(arr.substring(str.length(),arr.length()));
                }
                else {
                    // System.out.println("split wrong result: "+result);
                    result += convert(str,arr.substring(str.length(),arr.length()));
                }
                // str = "";
                break;
            }
        }
        
        return result;
    }
    
    static private boolean isRight(String str){
        int sum = 0;
        for(char c : str.toCharArray()){
            if(c == '(') sum++;
            else sum--;
            
            if(sum < 0) return false;
        }
        return true;
    }
}
 */
}
