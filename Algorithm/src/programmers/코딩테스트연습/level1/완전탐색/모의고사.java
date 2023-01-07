package programmers.코딩테스트연습.level1.완전탐색;

import java.util.HashSet;
import java.util.Set;

public class 모의고사 {
	
	static Set<Integer> set;
	static boolean[] prime;
	static boolean[] visit;
	
	public static void main(String[] args) {
		String numbers = "17";
		int len = numbers.length();
        char[] arr = new char[len];
        
        int idx = 0;
        for(char c : numbers.toCharArray()) arr[idx++] = c;
        
        set = new HashSet<>();
        prime = new boolean[10000000];
        prime[0] = prime[1] = true;
        
        visit = new boolean[8];
        for(int i=1;i<=7;i++) {
            persu(0,i,arr,"");
        }
        
//        return set.size();
        System.out.println(set.size());
	}
    
    
    
    private static void persu(int cnt, int limit, char[] arr, String str){
        
        if(cnt == limit){
            int num = Integer.parseInt(str);
            System.out.println(str+","+num);
            if(set.contains(num)) return;
            if(isPrime(num)) {
                set.add(num);
            }
            return;
        }
        
        for(int i=0;i<arr.length;i++) {
//        	System.out.println("i: "+ i);
            if(visit[i]) continue;
            visit[i] = true;
            persu(cnt+1,limit,arr,str + arr[i]);
            visit[i] = false;
        }
    }
    
    private static boolean isPrime(int num){
        
        if(num == 1) return false;
        else if(num == 2) return true;
        
        for(int i=2;i<=Math.sqrt(num);i++){
            if(prime[i] == true) continue;
            
            for(int j=i*i;j<num;j+=i) prime[j] = true;
        }
        
        return prime[num];
    }
/*
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int arr[] = new int[3];
        
        int len = answers.length;
        for(int i=0;i<len;i++){
            if(p1[i%5] == answers[i]) arr[0]++;
            if(p2[i%8] == answers[i]) arr[1]++;
            if(p3[i%10] == answers[i]) arr[2]++;
        }
        
        int max = Arrays.stream(arr).max().getAsInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<3;i++) if(arr[i] == max) q.add(i+1);
        
        len = q.size();
        int[] answer = new int[len];
        for(int i=0;i<len;i++) answer[i] = q.poll();
        return answer;
    }
}
 */
}
