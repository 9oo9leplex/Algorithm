package programmers.kakaointern.level2;

public class 순위검색 {
/*
import java.util.*;

class Solution {
    
    static HashMap<String, List<Integer>> hm;
    
    public int[] solution(String[] info, String[] query) {
        
        hm = new HashMap<>();
        for(String str : info) combi(0,0,"",str.split(" "));
        
        // System.out.println(hm);
        String[] arr,tmp;
        String str;
        int jumsu,cnt,idx = 0,len;
        int[] answer = new int[query.length];
        
        for(String key : hm.keySet()) Collections.sort(hm.get(key));
        
        for(String q : query){
            arr = q.split(" and ");
            str = "";
            tmp = arr[3].split(" ");
            
            str = arr[0] + arr[1] + arr[2] + tmp[0];
            jumsu = Integer.parseInt(tmp[1]);
            cnt = 0;
            
            if(!hm.containsKey(str)) answer[idx++] = 0;
            else {
                // System.out.println(jumsu+","+hm.get(str));
                len = hm.get(str).size();
                answer[idx++] = len - binarySearch(hm.get(str),jumsu);
            }
        }
        
        return answer;
    }
    
    private static int binarySearch(List<Integer> list, int jumsu){
        
        int left = 0, right = list.size() - 1;
        
        while(left <= right){
            int mid = (left + right) / 2;
                
            if(list.get(mid) < jumsu) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
    
    private static void combi(int start, int cnt, String str, String[] arr){
        
        if(cnt == 4){
            if(!hm.containsKey(str)) hm.put(str, new ArrayList<>());
            hm.get(str).add(Integer.parseInt(arr[4]));
            return;
        }
        
        for(int i=start;i<4;i++){
            combi(i+1,cnt+1,str+arr[i],arr);
            combi(i+1,cnt+1,str+"-",arr);
        }
        
    }
}









 */
}
