package programmers.kakaointern.level2;

public class 뉴스클러스터링 {
/*
import java.util.*;
class Solution {
    public int solution(String str1, String str2) {

        HashMap<String, Integer> s1 = new HashMap<>();
        HashMap<String, Integer> s2 = new HashMap<>();
        HashMap<String, Integer> hm = new HashMap<>();
        
        int len = str1.length() - 1;
        str1 = str1.toLowerCase();
        char[] arr = str1.toCharArray();
        String str;
        
        for(int i=0;i<len;i++){
            if(arr[i] - 'a' < 0 || arr[i] - 'a' > 25 || arr[i+1] - 'a' < 0 || arr[i+1] - 'a' > 25 ) continue;
            str = "";
            str += (char)arr[i];
            str += (char)arr[i+1];
            s1.put(str, s1.getOrDefault(str, 0) + 1);
        }
        
        len = str2.length() - 1;
        str2 = str2.toLowerCase();
        arr = str2.toCharArray();
        for(int i=0;i<len;i++){
            if(arr[i] - 'a' < 0 || arr[i] - 'a' > 25 || arr[i+1] - 'a' < 0 || arr[i+1] - 'a' > 25 ) continue;
            str = "";
            str += (char)arr[i];
            str += (char)arr[i+1];
            s2.put(str, s2.getOrDefault(str, 0) + 1);
        }
        
        if(s1.size() == 0 && s2.size() == 0) return 65536;
        
        int max,min,v1,v2,and = 0, or = 0;
        
        for(String key : s1.keySet()){
            if(s2.containsKey(key)){
                v1 = s1.get(key);
                v2 = s2.get(key);
                
                max = Math.max(v1,v2);
                min = Math.min(v1,v2);
                hm.put(key, max);
                or += max;
                and += min;
            }
            else {
                hm.put(key, s1.get(key));
                or += s1.get(key);
            }
        }
        
        for(String key : s2.keySet()){
            if(hm.containsKey(key)) continue;
            or += s2.get(key);
        }
        
        int answer = 0;
        return (int)((double) and / or * 65536);
    }
}
 */
}
