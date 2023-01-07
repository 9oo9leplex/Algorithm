package programmers.kakaointern.level1;

public class 키패드누르기 {
/*
import java.util.*;

class Solution {
    
    static class Hand {
        int r,c;
        
        public Hand(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    
    public String solution(int[] numbers, String hand) {
        
        Hand left = new Hand(3,0);
        Hand right = new Hand(3,2);
        
        HashMap<Integer, int[]> hm = new HashMap<>();
        hm.put(1,new int[]{0,0});   hm.put(2,new int[]{0,1});
        hm.put(3,new int[]{0,2});   hm.put(4,new int[]{1,0});
        hm.put(5,new int[]{1,1});   hm.put(6,new int[]{1,2});
        hm.put(7,new int[]{2,0});   hm.put(8,new int[]{2,1});
        hm.put(9,new int[]{2,2});   hm.put(0,new int[]{3,1});
        
        int dr, dl;
        int[] rc;
        StringBuilder sb = new StringBuilder();
        
        for(int number : numbers){
            
            rc = hm.get(number);
            
            if(number == 1 || number == 4 || number == 7){
                left.r = rc[0];
                left.c = rc[1];
                sb.append("L");
            }
            else if(number == 3 || number == 6 || number == 9){
                right.r = rc[0];
                right.c = rc[1];
                sb.append("R");
            }
            else {
                dr = Math.abs(right.r - rc[0]) + Math.abs(right.c - rc[1]);
                dl = Math.abs(left.r - rc[0]) + Math.abs(left.c - rc[1]);
                
                if(dr < dl){
                    right.r = rc[0];
                    right.c = rc[1];
                    sb.append("R");
                }
                else if(dr > dl){
                    left.r = rc[0];
                    left.c = rc[1];
                    sb.append("L");
                }
                else {
                    if(hand.equals("right")){
                        right.r = rc[0];
                        right.c = rc[1];
                        sb.append("R");
                    }
                    else {
                        left.r = rc[0];
                        left.c = rc[1];
                        sb.append("L");
                    }
                }
            }            
        }
        System.out.println(sb);
        
        return sb.toString();
    }
}
 */
}
