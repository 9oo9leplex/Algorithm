package programmers.코딩테스트연습.level1.완전탐색;

public class 소수찾기 {
/*
import java.util.*;
class Solution {
    
    static Set<Integer> set;
    // static boolean[] prime;
    static boolean[] visit;
    
    public int solution(String numbers) {
        
        int len = numbers.length();
        char[] arr = new char[len];
        
        int idx = 0;
        for(char c : numbers.toCharArray()) arr[idx++] = c;
        
        set = new HashSet<>();
        // prime = new boolean[10000000];
        // prime[0] = prime[1] = true;
        
        visit = new boolean[8];
        for(int i=1;i<=7;i++) persu(0,i,arr,"");
        // System.out.println(set);
        
        return set.size();
    }
    
    private static void persu(int cnt, int limit, char[] arr, String str){
        
        if(cnt == limit){
            int num = Integer.parseInt(str);
            // System.out.println(str+","+num);
            // System.out.println(set);
            if(set.contains(num)) return;
            if(isPrime(num)) {
                set.add(num);
            }
            return;
        }
        
        for(int i=0;i<arr.length;i++) {
            if(visit[i]) continue;
            visit[i] = true;
            persu(cnt+1,limit,arr,str + arr[i]);
            visit[i] = false;
        }
    }
    
    private static boolean isPrime(int num){
        
        if(num <= 1) return false;
        else if(num == 2) return true;
        
        for(int i=2;i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
}





 */
}
