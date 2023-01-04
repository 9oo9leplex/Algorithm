package programmers.kakaointern.level2;

public class 방금그곡 {
/*
import java.util.*;

class Solution {
    
    static HashMap<String,String> hm;
    static class Node implements Comparable<Node>{
        String name, akbo;
        int t,idx;
        
        public Node(String name, String akbo, int t, int idx){
            this.name = name;
            this.akbo = akbo;
            this.t = t;
            this.idx = idx;
        }
        
        @Override
        public String toString(){
            return "[idx,name,akbo,t]: ["+idx+","+name+","+akbo+","+t+"]";
        }
        
        @Override
        public int compareTo(Node o){
            if(this.t == o.t) return this.idx - o.idx;
            return o.t - this.t;
        }
    }
    
    public String solution(String m, String[] musicinfos) {
        
        hm = new HashMap<>();
        hm.put("A","H");    hm.put("A#","I");    hm.put("B","J");
        hm.put("C","K");    hm.put("C#","L");    hm.put("D","M");
        hm.put("D#","N");    hm.put("E","O");    hm.put("F","P");
        hm.put("F#","Q");    hm.put("G","R");    hm.put("G#","S");
        
        m = convert(m);
        String arr[];
        int time,idx=0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Node cur;
        // System.out.println(m);
        StringBuilder sb = new StringBuilder();
        
        int mlen = m.length() * 3, loop;
        
        for(String music : musicinfos){
            arr = music.split(",");
            
            time = minute(arr[0],arr[1]);
            if(time == 0){
                pq.add(new Node(arr[2],"",0,idx++));
                continue;
            }            
            arr[3] = convert(arr[3]);
            if(arr[3].length() > time) arr[3] = arr[3].substring(0,time);
            
            // System.out.println("Line54, arr[3]: "+ arr[3]);
            
            // m 길이의 2배로 만들기
            if(arr[3].length() < mlen){
                loop = mlen / arr[3].length() * 5 + 1;
                for(int i=0;i<loop;i++) sb.append(arr[3]);
            }
            else sb.append(arr[3]);
            
            // System.out.println("Line63, sb: "+ sb.toString());
            
            cur = new Node(arr[2],sb.toString(),time,idx++);
            // System.out.println(cur);
            pq.add(cur);
            sb.setLength(0);
        }
        
        time = 0;
        String answer = "(None)";
        for(Node node : pq){
            if(node.akbo.contains(m) && node.t > time) {
                time = node.t;
                answer = node.name;
            }
        }
        // return "(None)";
        return answer;
    }
    
    private static String convert(String str){
        
        int len = str.length();
        String result = "", tmp = "", arr[] = str.split("");
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<len;i++){
            
            if(i == len - 1) result += hm.get(arr[i]);
            else if(arr[i+1].equals("#")){
                result += hm.get(arr[i]+"#");
                i++;
            }
            else result += hm.get(arr[i]);
        }
        return result;
    }
    
    private static int minute(String start, String end){
        
        int s,e;
        String arr[] = start.split(":");
        s = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);

        arr = end.split(":");
        e = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);

        return e - s;
    }
}














 */
}
