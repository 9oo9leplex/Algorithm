package programmers.kakaointern.level2;

public class 캐시 {
/*
import java.util.*;
class Solution {
    
    static class Node implements Comparable<Node>{
        
        String name;
        int idx;
        
        public Node(String name, int idx){
            this.name = name;
            this.idx = idx;
        }
        
        @Override
        public String toString(){
            return "Node[name,idx]: ["+name+","+idx+"]";
        }
        
        @Override
        public int compareTo(Node o){
            return this.idx - o.idx;
        }
    }
    
    public int solution(int cacheSize, String[] cities) {
        
        if(cacheSize == 0) return cities.length * 5;
    
        PriorityQueue<Node> pq = new PriorityQueue<>();
        HashMap<String, Integer> hm = new HashMap<>();
        int answer = 0,idx = 0;
        List<Map.Entry<String,Integer>> entry;
        
        for(String city : cities){
            city = city.toLowerCase();
            if(hm.containsKey(city)) {
                answer++;
                hm.put(city,idx++);
            }
            else {
                
                if(hm.size() == cacheSize){
                    entry = new ArrayList<>(hm.entrySet());
                    entry.sort((s1,s2) -> s1.getValue() - s2.getValue());

                    hm.remove(entry.get(0).getKey());
                }
                hm.put(city,idx++);
                answer += 5;
                
                
            }
           
        }
        
        return answer;
    }
}
 */
}
