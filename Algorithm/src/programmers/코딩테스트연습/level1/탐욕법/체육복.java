package programmers.코딩테스트연습.level1.탐욕법;

public class 체육복 {
/*
import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        boolean[] stolen = new boolean[n+2];
        for(int l : lost) stolen[l] = true;
        
        boolean[] reser = new boolean[n+2];
        for(int r : reserve) reser[r] = true;
        
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(stolen[i]) {
                // 자기 자신 확인
                if(reser[i]) {
                    answer++;
                    reser[i] = false;
                }
                // 왼쪽 확인
                else if(!stolen[i-1] && reser[i-1]) {
                    answer++;
                    reser[i-1] = false;
                }
                // 오른쪽 확인
                else if(!stolen[i+1] && reser[i+1]) {
                    answer++;
                    reser[i+1] = false;
                }
            }
            else answer++;
        }
        
        // System.out.println(Arrays.toString(stolen));
        // System.out.println(Arrays.toString(reser));

        return answer;
    }
}
 */
}
