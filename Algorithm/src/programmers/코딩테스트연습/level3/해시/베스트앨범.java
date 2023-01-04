package programmers.코딩테스트연습.level3.해시;

public class 베스트앨범 {
/*
import java.util.*;
class Solution {
    
    static class Node implements Comparable<Node>{
        String genre;
        int plays,idx;
        
        public Node(String genre, int plays, int idx){
            this.genre = genre;
            this.plays = plays;
            this.idx = idx;
        }
        
        @Override
        public String toString(){
            return "[genre,plays,idx]: ["+genre+","+plays+","+idx+"]";
        }
        
        @Override
        public int compareTo(Node o){
            if(this.plays == o.plays) return this.idx - o.idx;
            return o.plays - this.plays;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        
        // HashMap<String, PriorityQueue<Node>> hm = new HashMap<>();
        HashMap<String, List<Node>> hm = new HashMap<>();
        HashMap<String, Integer> genre = new HashMap<>();
        
        int len = genres.length;
        for(int i=0;i<len;i++){
            // if(!hm.containsKey(genres[i])) hm.put(genres[i], new PriorityQueue<Node>());
            if(!hm.containsKey(genres[i])) hm.put(genres[i], new ArrayList<Node>());
            hm.get(genres[i]).add(new Node(genres[i],plays[i],i));
            genre.put(genres[i], genre.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<Map.Entry<String,Integer>> entry = new ArrayList<>(genre.entrySet());
        entry.sort((s1,s2) -> s2.getValue() - s1.getValue());
        // System.out.println(entry);
        
        for(String key : hm.keySet()){
            Collections.sort(hm.get(key));
            // System.out.println("[key,queue]: [" + key+","+hm.get(key)+"]");
        }
        
        // System.out.println("here"+entry.getKey());
        
        // List<Map.Entry<String,List<Node>>> entry = new ArrayList<>(hm.entrySet());
        // entry.sort((s1,s2) -> s2.getValue().size() - s1.getValue().size());
        // entry.sort((s1,s2) -> s2.getValue().get(0).plays - s1.getValue().get(0).plays);
        // System.out.println(entry);
        
        int cnt;
        Queue<Integer> q = new LinkedList<>();
        // for(Map.Entry<String, List<Node>> map : entry){
        // for(Map.Entry<String, PriorityQueue<Node>> map : entry){
        List<Node> cur;
        // for(String key : genre.keySet()){
        for(Map.Entry<String, Integer> map : entry){
            cnt = 0;
            cur = hm.get(map.getKey());
            // for(Node cur : map.getValue()){
            for(Node node : cur){
                // System.out.println(node);
                if(cnt == 2) break;
                q.add(node.idx);
                cnt++;
            }
        }
        
        len = q.size();
        int[] answer = new int[len];
        for(int i=0;i<len;i++) answer[i] = q.poll();
        
        // return new int[]{};
        return answer;
    }
}
 */
}
