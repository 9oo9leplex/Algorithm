package programmers.kakaointern.level2;

public class 후보키 {
/*
import java.util.*;
class Solution {
    
    static int answer,len,gijun;
    static int[] numbers;
    static Set<String> candidate;
    static Queue<String> group;
    
    public int solution(String[][] relation) {
        
        gijun = relation.length;
        len = relation[0].length;
        
        candidate = new HashSet<>();
        group = new LinkedList<>();
        
        for(int i=1;i<=len;i++){
            numbers = new int[i];
            combi(0,0,i,relation);
        }
        
        System.out.println(group);
        
        String str,tmp;
        Queue<String> g = new LinkedList<>();
        int size;
        while(true){
            
            if(group.isEmpty()) break;
            
            str = group.poll();
            g.add(str);
            size = group.size();
            // System.out.println(str);
            
            
            
            for(int i=0;i<size;i++){
                tmp = group.poll();
                for(char c : str.toCharArray()){
                    if(!tmp.contains(String.valueOf(c))) {
                        group.add(tmp);
                        break;
                    }
                }
                // if(tmp.contains(str)) continue;
                // group.add(tmp);
            }
        }
        
        // System.out.println(g);
        
        return g.size();
    }
    
    static private void combi(int start, int cnt, int limit, String[][] relation){
        
        if(cnt == limit){
            // System.out.println(Arrays.toString(numbers));
            
            String str;
            for(String[] rel : relation){
                str = "";
                for(int idx : numbers) str += rel[idx];
                candidate.add(str);
            }
            
            if(candidate.size() == gijun){
                str = "";
                for(int num : numbers) str += num;
                group.add(str);
            }
            
            candidate.clear();
            return;
        }
        
        for(int i=start;i<len;i++){
            numbers[cnt] = i;
            combi(i+1,cnt+1,limit,relation);
        }
    }
}
 */
}
