package programmers.코딩테스트연습.level2.스택큐;

public class 다리를지나는트럭 {
/*
import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int[] arr = new int[bridge_length];
        int now = 0, idx = 0, answer = 0, len = truck_weights.length;
        
        while(idx < len){
            answer++;
            now -= arr[bridge_length-1];
            for(int i=bridge_length-1;i>0;i--) arr[i] = arr[i-1];
            
            if(weight >= now + truck_weights[idx]){
                arr[0] = truck_weights[idx];
                now += truck_weights[idx++];
            }
            else arr[0] = 0;
        }
        
        answer += bridge_length;
        
        return answer;
    }
}
 */
}
