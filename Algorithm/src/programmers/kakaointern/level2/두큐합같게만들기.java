package programmers.kakaointern.level2;

public class 두큐합같게만들기 {
/*
import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        
        long r1,r2,s1,s2;
        int len = queue1.length;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        r1 = r2 = 0;
        
        for(int i=0;i<len;i++){
            r1 += queue1[i];
            r2 += queue2[i];
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        
        s1 = r1;
        s2 = r2;
        
        int num, cnt = 0;
        len = (queue1.length + queue2.length ) * 2;
        
        while(true){
            if(q1.isEmpty() || q2.isEmpty()) return -1;
            else if(s1 == s2) return cnt;
            
            if(s1 > s2){
                num = q1.poll();
                q2.add(num);
                s1 -= num;
                s2 += num;
            } else{
                num = q2.poll();
                q1.add(num);
                s2 -= num;
                s1 += num;
            }
            
            cnt++;
            if(len < cnt) return -1;
        }
    }
    
}
 */
}
