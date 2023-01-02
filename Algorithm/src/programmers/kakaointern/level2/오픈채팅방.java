package programmers.kakaointern.level2;

public class 오픈채팅방 {
/*
import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        
        HashMap<String, String> hm = new HashMap<>();
        // StringBuilder sb = new StringBuilder();
        Queue<String> order = new LinkedList<>();
        Queue<String> user = new LinkedList<>();
        String str[];
            
        for(String rec : record){
            str = rec.split(" ");
            
            if("Leave".equals(str[0])){
                order.add(str[0]);
                user.add(str[1]);
            }
            else {
                if("Change".equals(str[0])){
                    hm.put(str[1],str[2]);
                } else {
                    hm.put(str[1],str[2]);
                    order.add(str[0]);
                    user.add(str[1]);
                }
            }
        }
        
        int len = order.size();
        String answer[] = new String[len],o,u;
        for(int i=0;i<len;i++){
            o = order.poll();
            u = user.poll();

            if("Enter".equals(o)) answer[i] = hm.get(u) + "님이 들어왔습니다.";
            else answer[i] = hm.get(u) + "님이 나갔습니다.";  
        }
        
        
        return answer;
    }
}
 */
}
