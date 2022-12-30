package programmers.kakaointern.level1;

public class 성격유형검사하기 {

/*
import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        
        String str = "";
        int len = choices.length;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('R',0);  hm.put('T',1);  hm.put('C',2);  hm.put('F',3);
        hm.put('J',4);  hm.put('M',5);  hm.put('A',6);  hm.put('N',7);
        
        int arr[] = new int[8];
        char s[] = {'R','T','C','F','J','M','A','N'};
        int idx = 0;
        
        
        for(int i=0;i<len;i++){
            str = survey[i];
            if(choices[i] == 4) continue;
            // 앞
            else if(choices[i] < 4) {
                arr[hm.get(str.charAt(0))] += Math.abs( 4 - choices[i]);
            }
            else {
                arr[hm.get(str.charAt(1))] += Math.abs( 4 - choices[i]);
            }
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(s));
        str = "";
        for(int i=0;i<4;i++){
            if(arr[2*i] >= arr[2*i+1]) str += s[2*i];
            else str += s[2*i+1];
        }
        
        return str;
    }
}
 */
}
