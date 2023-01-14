package baekjoon.S4.탐욕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class 기타줄1049 {
/*
public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int val = n / 6, mod = n % 6;
		int set[] = new int[m];
		int solo[] = new int[m];
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			
			set[i] = Integer.parseInt(st.nextToken());
			solo[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(set);
		Arrays.sort(solo);
		
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(set[0] * val + mod * solo[0]);
		pq.add(solo[0] * n);
		if(mod != 0) pq.add(set[0] * (val + 1));
		
		System.out.println(pq.poll());
	}
 */
}
