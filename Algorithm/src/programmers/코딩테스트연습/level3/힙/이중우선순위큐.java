package programmers.코딩테스트연습.level3.힙;

public class 이중우선순위큐 {
/*
import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        
        List<Integer> list = new ArrayList<>();
        
        String[] arr;
        int num,len;
        for(String operation : operations){
            arr = operation.split(" ");
            num = Integer.parseInt(arr[1]);    
            
            if("I".equals(arr[0])) list.add(num);
            else {
                len = list.size();
                if(len == 0) continue;
                Collections.sort(list);
                if(num == -1) list.remove(0);
                else list.remove(len-1);
            }
            // System.out.println(list);
        }
        int[] answer = {0,0};
        len = list.size();
        if(len != 0){
            Collections.sort(list);
            answer[0] = list.get(len-1);
            answer[1] = list.get(0);
        }
        return answer;
    }
}
 */
}
