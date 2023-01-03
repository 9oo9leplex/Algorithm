package programmers.kakaointern.level2;

public class 단체사진찍기 {
/*
import java.util.*;

class Solution {
    
    // static char[] arr = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    static boolean[] visit;
    // static char[] fixed;
    static int answer ,ex;
    static HashMap<Character, Integer> hm;
    
    public int solution(int n, String[] data) {
        
        hm = new HashMap<>();
        hm.put('A', 0); hm.put('C', 1); hm.put('F', 2); hm.put('J', 3);
        hm.put('M', 4); hm.put('N', 5); hm.put('R', 6); hm.put('T', 7);
        
        visit = new boolean[8];
        int[] fixed = new int[8];
        answer = 0;
        persu(0,data,fixed);
        
        return answer;
    }
    
    private static boolean check(String[] datas, int[] fixed){
        
        char c1,c2,c3,c4;
        int i1,i2,diff,c5;
        for(String data : datas){
            // 1,3 캐릭 , 2 물결, 4 부등호, 5 숫자
            
            i1 = fixed[hm.get(data.charAt(0))];
            i2 = fixed[hm.get(data.charAt(2))];
            diff = Math.abs(i1 - i2);
            // c1 = data.charAt(0);
            // c2 = data.charAt(1);
            // c3 = data.charAt(2);
            c4 = data.charAt(3);
            c5 = data.charAt(4) - '0' + 1;
//             if(ex < 100) {
//                 System.out.println(Arrays.toString(fixed));
//                 System.out.println("[i1,i2,조건,숫자]: ["+i1+","+i2+","+c4+","+c5+"]");
                
//             }
            
            // i1 = Arrays.binarySearch(fixed,c1);
            // i2 = Arrays.binarySearch(fixed,c3);
            // diff = Math.abs(i1-i2);
           
//             if(ex < 100) {
//                 System.out.println(Arrays.toString(fixed));
//                 System.out.println("[c1,c3,i1,i2,diff,조건,숫자]: ["+c1+","+c3+","+i1+","+i2+","+diff+","+c4+","+c5+"]");
                
//             }
            
            if(c4 == '='){
                if(diff != c5) return false;
            }
            else if(c4 == '<'){
                if(diff >= c5) return false;
            }
            else {
                if(diff <= c5) return false;
            }
        }
        return true;
    }
    
    private static void persu(int cnt, String[] data, int fixed[]){
        
        if(cnt == 8) {
            // if(ex < 100) System.out.println(Arrays.toString(fixed));
            ex++;
            
            if(check(data,fixed)) answer++;
            
            return;
        }
        
        for(int i=0;i<8;i++){
            if(visit[i]) continue;
            // fixed[cnt] = arr[i];
            fixed[cnt] = i;
            visit[i] = true;
            persu(cnt+1,data,fixed);
            visit[i] = false;
        }
    }
}
 */
}
