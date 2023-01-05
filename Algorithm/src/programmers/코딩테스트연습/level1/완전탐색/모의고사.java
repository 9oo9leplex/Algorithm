package programmers.코딩테스트연습.level1.완전탐색;

public class 모의고사 {
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
