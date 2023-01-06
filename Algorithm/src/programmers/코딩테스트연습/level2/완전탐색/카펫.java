package programmers.코딩테스트연습.level2.완전탐색;

public class 카펫 {
/*
import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        
        List<Integer> list = new ArrayList<>();
        int loop = yellow / 2;
        for(int i=1;i<=yellow;i++){
            if(yellow % i == 0) {
                list.add(i);
                // list.add(yellow/i);
            }
        }
        
        Collections.sort(list);
        System.out.println(list);
        int len = list.size(),garo,sero,tmp;
        for(int i=0;i<len;i++){
            garo = list.get(i) + 2;
            sero = list.get(len-1-i) + 2;
            System.out.println(garo+","+sero);
            if(sero > garo) {
                tmp = sero;
                sero = garo;
                garo = tmp;
            }
            
            if(garo * sero == brown + yellow) return new int[]{garo, sero};
        }
        
        return new int[]{0,0};
    }
}
 */
}
