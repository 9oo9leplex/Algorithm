package programmers.kakaointern.level2;

public class 압축 {
/*
import java.util.*;
class Solution {
    public int[] solution(String msg) {
        
        int idx = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        String alphabet;

        for(int i=0;i<26;i++){
            alphabet = String.valueOf((char)('A' + i));
            hm.put(alphabet,idx++);
        }
        
        // System.out.println(hm);
        alphabet = "";
        Queue<Integer> q = new LinkedList<>();
        int len;
        for(char c : msg.toCharArray()){
            
            alphabet += c;
            if(!hm.containsKey(alphabet)){
                len = alphabet.length();
                hm.put(alphabet,idx++);
                
                q.add(hm.get(alphabet.substring(0,len-1)));
                alphabet = alphabet.substring(len-1,len);
                // System.out.println("[alphabet]: ["+alphabet+"]");
            }
        }
        q.add(hm.get(alphabet));
        // System.out.println("queue]: ["+q+"]");
        
        int[] answer = new int[q.size()];
        idx = 0;
        while(!q.isEmpty()) answer[idx++] = q.poll();
        return answer;
    }
}
 */
}
