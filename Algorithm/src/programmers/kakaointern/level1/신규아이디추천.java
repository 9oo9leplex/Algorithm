package programmers.kakaointern.level1;

public class 신규아이디추천 {
/*
import java.util.*;
class Solution {
    public String solution(String new_id) {
        
        // 1단계 소문자 치환
        new_id = new_id.toLowerCase();
        
        // 2단계 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자 제거
        String id = "";
        for(char c : new_id.toCharArray()){
            if(c - 'a' >= 0 && c - 'a' <= 25) id += c;
            else if(c - '0' >= 0 && c - '0' <= 9) id += c;
            else if(c == '-' || c == '_' || c == '.') id += c;
        }
        
        new_id = id;
        id = "";
        boolean flag = false;
        for(char c : new_id.toCharArray()){
            if(c != '.') {
                if(flag){
                    id += '.';
                    flag = false;
                }
                id += c;
            }
            else flag = true;
        }
        
        new_id = id;
        id = "";
        int len = new_id.length();
        if(len == 0) return "aaa";
        
        char first = new_id.charAt(0); 
        char last;
        if(len <= 1) {
            if(first == '.') new_id = "";
        }
        else if(len >= 2){
            last = new_id.charAt(len-1);
            if(first == '.' && last == '.') new_id = new_id.substring(1,len-1);
            else if(first == '.') new_id = new_id.substring(1,len);
            else if(last == '.') new_id = new_id.substring(0,len-1);
        }
        
        if(new_id.equals("")) return "aaa";
        
        len = new_id.length();
        if(len > 15) {
            new_id = new_id.substring(0,15);
            if(new_id.charAt(14) == '.') new_id = new_id.substring(0,14);
        }
        
        // len = new_id.length();
        if(len < 3){
            last = new_id.charAt(len-1);
            while(true){
                new_id += last;
                len++;
                if(len == 3) break;
            }
            
        }
        
        // System.out.println(new_id.charAt(len-2));
        // System.out.println(new_id);
        
        return new_id;
    }
}
 */
}
