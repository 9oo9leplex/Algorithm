package programmers.코딩테스트연습.level2.스택큐;

public class 기능개발 {
/*
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int div,diff,mod,len = progresses.length, arr[] = new int[len];
        for(int i=0;i<len;i++){
            diff = 100 - progresses[i];
            div = diff / speeds[i];
            mod = diff % speeds[i];
            
            arr[i] = mod == 0 ? div : div + 1;
        }
        
        // System.out.println(Arrays.toString(arr));
        Queue<Integer> q = new LinkedList<>();
        int cnt = 1,gijun = arr[0];
        for(int i=1;i<len;i++){
            if(gijun >= arr[i]) cnt++;
            else {
                q.add(cnt);
                cnt = 1;
                gijun = arr[i];
            }
        }
        q.add(cnt);
        len = q.size();
        int[] answer = new int[len];
        for(int i=0;i<len;i++) answer[i] = q.poll();
        
        return answer;
    }
}
 */
}
