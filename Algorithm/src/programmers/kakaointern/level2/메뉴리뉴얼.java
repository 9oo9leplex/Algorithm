package programmers.kakaointern.level2;

public class 메뉴리뉴얼 {

/*
import java.util.*;
class Solution {
    
    static PriorityQueue<String> pq;
    
    public String[] solution(String[] orders, int[] course) {
        
        pq = new PriorityQueue<>();
        HashMap<String, Integer> hm;
        String str;
        List<Map.Entry<String,Integer>> entry;
        int max;
        PriorityQueue<String> result = new PriorityQueue<>();
        
        for(int cour : course){
            hm = new HashMap<>();
            for(String order : orders){
                if(order.length() < cour) continue;
                combi(0,0,cour,"",order);
            }
            
            // System.out.println(pq);
            
            while(!pq.isEmpty()){
                str = pq.poll();
                // System.out.println(str);
                hm.put(str,hm.getOrDefault(str, 0) + 1);
            }
            
            entry = new ArrayList<>(hm.entrySet());
            entry.sort((s1,s2) -> s2.getValue() - s1.getValue());
            if(entry.size() == 0) continue;
            max = entry.get(0).getValue();
            
            for(Map.Entry<String,Integer> map : entry){
                // System.out.println(map);
                if(map.getValue() < 2 || max > map.getValue()) break;
                result.add(map.getKey());
            }
        }
        
        // System.out.println(result);
        String[] answer = new String[result.size()];
        
        max = 0;
        while(!result.isEmpty()) answer[max++] = result.poll();
        
        return answer;
    }
    
    static void combi(int start, int cnt, int limit, String menu, String order){
        
        if(cnt == limit){
            
            // System.out.println(menu);
            
            char[] arr = menu.toCharArray();
            Arrays.sort(arr);
            String str = "";
            for(char c : arr) str += c;
            
            pq.add(str);
            
            return;
        }
        
        for(int i=start;i<order.length();i++){
            combi(i+1,cnt+1,limit,menu+order.charAt(i),order);
        }
    }
}
 */
}
