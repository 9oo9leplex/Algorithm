package programmers.kakaointern.level2;

public class 수식최대화 {
/*
import java.util.*;
class Solution {
    
    static char[][] oper = { 
        {'+', '-', '*'},
        {'+', '*', '-'},
        {'-', '*', '+'},
        {'-', '+', '*'},
        {'*', '+', '-'},
        {'*', '-', '+'}
    };
    
    public long solution(String expression) {

        String str = "";
        
        // Queue<Integer> numbers = new LinkedList<>();
        Deque<Long> orinum = new ArrayDeque<>();
        Deque<Long> numbers;
        Queue<Character> orioper = new LinkedList<>();
        Queue<Character> operators;
        
        for(char c : expression.toCharArray()){
            if(c == '+' || c == '-' || c == '*'){
                orioper.add(c);
                orinum.add(Long.parseLong(str));
                str = "";
            }
            else str += c;
        }
        orinum.add(Long.parseLong(str));
       
        char op;
        long n1,n2,tmp = 0, max = 0;
        int len;
        
        for(int i=0;i<6;i++){
            
            numbers = new ArrayDeque<>(orinum);
            operators = new LinkedList<>(orioper);
            
            for(int j=0;j<3;j++){
                len = operators.size();
                // while(operators.contains(oper[i][j])){
                for(int k=0;k<len;k++){
                    
                    if(numbers.size() == 1 || operators.isEmpty()) break;
                    
                    // System.out.println(i+"번째, "+k+"반복");
                    // System.out.println(numbers);
                    // System.out.println(operators);
                    
                    op = operators.poll();
                    n1 = numbers.poll();
                    
                    if(op != oper[i][j]) {
                        operators.add(op);
                        numbers.add(n1);
                        continue;
                    }
                    
                    n2 = numbers.poll();
                    
                    if(op == '+') tmp = n1 + n2;
                    else if(op == '-') tmp = n1 - n2;
                    else tmp = n1 * n2;
                    
                    numbers.addFirst(tmp);
                    // if(!operators.isEmpty()){
                    //     operators.add(operators.poll());
                    // }
                }
                numbers.add(numbers.poll());
            }
            
            max = Math.max(max, Math.abs(numbers.poll()));
        }
        
        // System.out.println(numbers);
        // System.out.println(operators);
        
        long answer = 0;
        return max;
    }
    
    
}
 */
}
