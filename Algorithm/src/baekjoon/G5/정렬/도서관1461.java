package baekjoon.G5.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class 도서관1461 {
/*
public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int num;
		
		Queue<Integer> negative = new PriorityQueue<>((o1,o2) -> o2 - o1);
		Queue<Integer> positive = new PriorityQueue<>((o1,o2) -> o2 - o1);
		
		for(int i=0;i<n;i++) {
			num = Integer.parseInt(st.nextToken());
			if(num > 0) positive.add(num);
			else negative.add(Math.abs(num));
		}
		
		int max = 0;
		if(negative.isEmpty()) max = positive.peek();
		else if(positive.isEmpty()) max = negative.peek();
		else max = Math.max(negative.peek(), positive.peek());
		int answer = 0;
		
		while(!negative.isEmpty()) {
			num = negative.poll();
			for(int i=0;i<m-1;i++) {
				negative.poll();
				
				if(negative.isEmpty()) break;
			}
			answer += num * 2;
		}
		
		while(!positive.isEmpty()) {
			num = positive.poll();
			for(int i=0;i<m-1;i++) {
				positive.poll();
				
				if(positive.isEmpty()) break;
			}
			answer += num * 2;
		}
		
		answer -= max;
		System.out.println(answer);
		
	}
 */
}
