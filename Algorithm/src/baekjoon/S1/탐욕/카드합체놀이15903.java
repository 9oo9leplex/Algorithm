package baekjoon.S1.탐욕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class 카드합체놀이15903 {
/*
public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Queue<Long> pq = new PriorityQueue<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) pq.add(Long.parseLong(st.nextToken()));
		
		long sum;
		for(int i=0;i<m;i++) {
			sum = 0;
			sum += pq.poll();
			sum += pq.poll();
			pq.add(sum);
			pq.add(sum);
		}
		
		long answer = 0;
		while(!pq.isEmpty()) answer += pq.poll();
		System.out.println(answer);
	}
 */
}
