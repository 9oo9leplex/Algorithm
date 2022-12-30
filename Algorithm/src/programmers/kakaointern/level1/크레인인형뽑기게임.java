package programmers.kakaointern.level1;

public class 크레인인형뽑기게임 {
/*
import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        
        int answer = 0;
        int col, row = board.length;
        int target = 0;
        Stack<Integer> stack = new Stack<>();
        boolean flag;
        
        for(int move : moves){
            col = move - 1;
            flag = false;
            for(int i=0;i<row;i++){
                if(board[i][col] != 0){
                    target = board[i][col];
                    board[i][col] = 0;
                    flag = true;
                    break;
                }
            }
            
            // System.out.println(target);
            // System.out.println(stack);
            if(flag){
                if(!stack.isEmpty() && stack.peek() == target){
                    stack.pop();
                    answer += 2;
                }
                else stack.add(target);    
            }
            
        }
        
        
        
        return answer;
    }
}
 */
}
