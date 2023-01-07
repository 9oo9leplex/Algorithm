package programmers.kakaointern.level2;

public class k진수에서소수개수구하기 {
/*
import java.util.*;
class Solution {
    public int solution(int n, int k) {
        
        StringBuilder sb = new StringBuilder();
        
        int val, mod, tmp = n;
        while(tmp > 0){
            mod = tmp % k;
            tmp /= k;
            sb.insert(0,mod);
        }
        sb.insert(0,tmp);
        
        // System.out.println(sb);
        String[] str = sb.toString().split("0");
        // System.out.println(Arrays.toString(str));
        int answer = 0;
        
        for(String s : str){
            if("".equals(s)) continue;
            
            if(isPrime(Long.parseLong(s))) answer++;
        }
        
        
        return answer;
    }
    
    static boolean isPrime(long x){
        
        if(x == 1) return false;
        else if(x == 2) return true;
        
        int limit = (int) Math.sqrt(x);
        for(int i=2;i<=limit;i++){
            if(x % i == 0) return false;
        }
        return true;
    }
}
 */
}
