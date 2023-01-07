package baekjoon.G5.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class 강의실배정11000 {
/*
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());		
		int[][] arr = new int[n][2];
		
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr,(o1,o2) -> {
			if(o1[0] == o2[0]) return o1[1] - o2[1];
			return o1[0] - o2[0];
		});
		
		Queue<Integer> q = new PriorityQueue<>();
		
		q.add(arr[0][1]);
		for(int i=1;i<n;i++) {
			if(q.peek() <= arr[i][0]) q.poll();
			q.add(arr[i][1]);
		}
		
		System.out.println(q.size());
	}
 */
}
