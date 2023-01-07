package programmers.kakaointern.level2;

public class 파일명정렬 {
/*
import java.util.*;

class Solution {
    
    static class Node implements Comparable<Node>{
        
        String head, str;
        int numbers,idx;
        
        public Node(int idx){
            this.idx = idx;
        }
        
        public Node(String head, int numbers, String str, int idx){
            this.head = head;
            this.numbers = numbers;
            this.str = str;
            this.idx = idx;
        }
        
        @Override
        public String toString(){
            return "Node[head,numbers,str,idx]: ["+head+","+numbers+","+str+","+idx+"]";
        }
        
        @Override
        public int compareTo(Node o){
            if(this.head.toLowerCase().equals(o.head.toLowerCase())){
                if(this.numbers == o.numbers) return this.idx - o.idx;
                return this.numbers - o.numbers;
            }
            return this.head.toLowerCase().compareTo(o.head.toLowerCase());
        }
    }
    
    public String[] solution(String[] files) {
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        String head,numbers;
        int num,idx = 0;
        boolean flag;
        Node cur;
        
        for(String file : files){
            flag = false;
            head = "";
            numbers = "";
            num = 0;
            cur = new Node(idx++);
            
            for(char c : file.toCharArray()){
                if(c - '0' >= 0 && c -'0' <= 9){
                    flag = true;
                    numbers += c;
                }
                else if(!flag) head += c;
                else break;
            }
            
            num = Integer.parseInt(numbers);
            // System.out.println("[head,numbers,num]: ["+head+","+numbers+","+num+"]");
            cur.head = head;
            cur.numbers = num;
            cur.str = file;
            pq.add(cur);
        }
        
        String[] answer = new String[pq.size()];
        idx = 0;
        while(!pq.isEmpty()) answer[idx++] = pq.poll().str;//System.out.println(pq.poll().str);
        
        return answer;
    }
}














 */
}
