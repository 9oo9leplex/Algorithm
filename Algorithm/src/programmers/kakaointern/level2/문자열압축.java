package programmers.kakaointern.level2;

public class 문자열압축 {
/*
import java.util.*;

class Solution {
    public int solution(String s) {
        
        int start,end,cnt, len = s.length(), l,j;
        int loop = len / 2, answer = len;
        String str,tmp;
        boolean flag;
        
        for(int i=1;i<=loop; i++){
            cnt = 1;
            str = s.substring(0,i);
            tmp = "";
            l = len / i - 1;
            flag = len % i == 0 ? false : true;
            // System.out.println("[중복횟수,기준단어,반복횟수]: ["+cnt+","+str+","+l+"]");
            
            for(j=0;j<l;j++){
                if(str.equals(s.substring(i*(1+j),i*(2+j)))) cnt++;
                else {
                    if(cnt == 1) tmp += str;
                    else tmp += String.valueOf(cnt) + str;
                    
                    str = s.substring(i*(1+j),i*(2+j));
                    cnt = 1;
                    // System.out.println("[만들어진 단어, 기준]: [" + tmp+","+str+"]");
                }
            }
            // 1이면 그냥, 1 외는 숫자 + 문자, 나머지 단어들도 다 붙도록
            if(cnt == 1) tmp += str;
            else tmp += String.valueOf(cnt) + str;
            
            // System.out.println("[단어길이, 기준단어길이, 나머지 여부]: [" + len+","+i+","+(len%i)+","+flag+"]");
            
            if(flag) tmp += s.substring(i*(1+j),len);
            
            // System.out.println("완성본: " + tmp);
            answer = Math.min(tmp.length(),answer);
            // System.out.println(answer);
        }
        
        return answer;
    }
}
 */
}
