package programmers.kakaointern.level2;

public class 주차요금계산 {
/*
import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, Integer> result = new HashMap<>();
        String[] str;
        int min,tmp;
        
        for(String record : records){
            str = record.split(" ");
            
            min = convertMin(str[0]);
            if("IN".equals(str[2])){
                hm.put(str[1], min);
            }
            else{
                tmp = hm.get(str[1]);
                result.put(str[1], result.getOrDefault(str[1],0) + min - tmp);
                hm.put(str[1],-1);
                // System.out.println(result);
            }
        }
        
        for(String key : hm.keySet()){
            if(hm.get(key) != -1) {
                tmp = hm.get(key);
                result.put(key, result.getOrDefault(key, 0) + 1439 - tmp);
            }
        }
        
        List<Map.Entry<String,Integer>> entry = new ArrayList<>(result.entrySet());
        entry.sort((s1,s2) -> s1.getKey().compareTo(s2.getKey()));
        
        tmp = hm.size();
        int[] answer = new int[tmp];
        int idx = 0;
        
        for(Map.Entry<String,Integer> map : entry){
            
            tmp = result.get(map.getKey()) - fees[0];
            if(tmp <= 0){
                answer[idx++] = fees[1];
                continue;
            }
            
            min = tmp / fees[2];
            // System.out.println("[시간,가준시간,몫,나머지]: ["+tmp+","+fees[2]+","+(tmp / fees[2])+","+(tmp % fees[2])+"]");
            if(tmp % fees[2] != 0) min++;
            answer[idx++] = fees[1] + min * fees[3]; 
            
            
            
        }
        
        return answer;
    }
    
    static int convertMin(String input){
        String[] str = input.split(":");
        
        return Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
        
    }
}
 */
}
