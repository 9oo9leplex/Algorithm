package programmers.kakaointern.level1;

public class 신고결과받기 {
/*
import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        HashMap<String,Set<String>> hm = new HashMap<>();
        HashMap<String,Integer> count = new HashMap<>();
        HashMap<String,Integer> index = new HashMap<>();
        
        int idx = 0;
        for(String id : id_list){
            hm.put(id,new HashSet<String>());
            index.put(id, idx++);
        }
        
        String[] cur;
        for(String str : report){
            cur = str.split(" ");
            if(hm.get(cur[0]).add(cur[1])) {
                // count.put(cur[0],count.getOrDefault(cur[0], 0) + 1);
                count.put(cur[1],count.getOrDefault(cur[1], 0) + 1);
            }
        }
        
        // System.out.println(count);
        // System.out.println(hm);
        Queue<String> names = new LinkedList<>();
        int[] answer = new int[id_list.length];
        
        
        for(String key : count.keySet()){
            if(count.get(key) < k) continue;
            names.add(key);
            // answer[index.get(key)]++;
        }
        int cnt;
        // System.out.println(names);
        // System.out.println(Arrays.toString(answer));
        
        for(String id : id_list){
            if(hm.get(id).size() == 0) continue;
            cnt = 0;
            for(String name : names){
                if(hm.get(id).contains(name)) answer[index.get(id)] += 1;
            }
        }
        
        
        return answer;
    }
}
 */
}
