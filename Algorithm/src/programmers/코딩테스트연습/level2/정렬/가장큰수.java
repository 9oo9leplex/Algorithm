package programmers.코딩테스트연습.level2.정렬;

public class 가장큰수 {
/*
import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        
        int len = numbers.length;
        String[] arr = new String[len];
        Queue<String> q = new PriorityQueue<>((o1,o2) -> {
           int sum1 = Integer.parseInt(o1+o2); 
           int sum2 = Integer.parseInt(o2+o1); 
            
            if(sum1 > sum2) return 1;
            return -1;
        });
        // Queue<String> q[] = new PriorityQueue[9];
        
//        Queue<String> q = new PriorityQueue<>((o1,o2) -> {
//        
//            if(o1.charAt(0) == o2.charAt(0)){
//                int len1 = o1.length();
//                int len2 = o2.length();
//                int num1, num2;
//                int first;
//                
//                if(len1 > len2){
//                    num1 = Integer.parseInt(o1.substring(0,len2));
//                    num2 = Integer.parseInt(o2);
//                    if(num1 < num2) return -1;
//                    else if(num1 > num2) return 1;
//                    
//                    first = o1.charAt(0) - '0';
//                    for(char c : o1.substring(len2,len1).toCharArray()){
//                        if(c - '0' < first) return -1;
//                        else if(c - '0' > first) return 1;
//                    }
//                    len1 = Integer.parseInt(o1+o2);
//                    len2 = Integer.parseInt(o2+o1);
//                    if(len1 > len2) return 1;
//                    return -1;
//                }
//                else if(len1 < len2){
//                    num1 = Integer.parseInt(o1);
//                    num2 = Integer.parseInt(o2.substring(0,len1));
//                    if(num1 < num2) return -1;
//                    else if(num1 > num2) return 1;
//                    
//                    first = o2.charAt(0) - '0';
//                    for(char c : o2.substring(len1,len2).toCharArray()){
//                        if(c - '0' < first) return 1;
//                        else if(c - '0' > first) return -1;
//                    }
//                    len1 = Integer.parseInt(o1+o2);
//                    len2 = Integer.parseInt(o2+o1);
//                    if(len1 > len2) return 1;
//                    return -1;
//                }
//                else {
//                    num1 = Integer.parseInt(o1);
//                    num2 = Integer.parseInt(o2.substring(0,len1));
//                    if(num1 < num2) return -1;
//                    else if(num1 > num2) return 1;
//                }
//            }
//        return (o1.charAt(0) - '0') - (o2.charAt(0) - '0');
//        });
        
//         for(int i=0;i<9;i++) q[i] = new PriorityQueue<>((o1,o2) -> {
            
//         return 1;
//         });
        // Queue<String> q = new PriorityQueue<>((o1,o2) -> {
        //     if(o1.charAt(0) == o2.charAt(0)) return o1.length() - o2.length();
        //     return 1;
        //     });
        String tmp;
        int sum = 0;
        for(int i=0;i<len;i++) {
            sum += numbers[i];
            tmp = String.valueOf(numbers[i]);
            // arr[i] = String.valueOf(numbers[i]); 
            // q[tmp.charAt(0) - '0' - 1].add(String.valueOf(numbers[i]));
            q.add(tmp);
        }
        
        if(sum == 0) return "0";
        // while(!q.isEmpty()) System.out.println(q.poll());
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()) sb.insert(0,q.poll());
        
        return sb.toString();
        // return "";
    }
}
 */
}
