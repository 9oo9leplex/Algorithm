package baekjoon.S2.탐욕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class 잃어버린괄호1541 {
/*
public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String str = "";
		Deque<Integer> numbers = new ArrayDeque<>();
		Queue<Character> opers = new LinkedList<>();
		
		for(char c : input.toCharArray()) {
			if(c == '-' || c == '+') {
				opers.add(c);
				numbers.add(Integer.parseInt(str));
				str = "";
			}
			else str += c;
		}
		
		Queue<Integer> num = new LinkedList<>();
		
		numbers.add(Integer.parseInt(str));
//		System.out.println(numbers);
//		System.out.println(opers);
		
		int num1, num2;
		char op;
		while(opers.contains('+')) {
			num1 = numbers.poll();
			op = opers.poll();
			
			if(op == '-') {
				num.add(num1);
//				opers.add(op);
			}
			else {
				num2 = numbers.poll();
				numbers.addFirst(num1 + num2);
			}
		}
		
		while(!numbers.isEmpty()) num.add(numbers.poll());
		
//		System.out.println(num);
		
		int answer = num.poll();
		while(!num.isEmpty()) answer -= num.poll();
		
		System.out.println(answer);
	}
 */
}
