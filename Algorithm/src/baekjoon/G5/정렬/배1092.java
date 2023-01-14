package baekjoon.G5.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 배1092 {
/*
public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Integer[] cranes = new Integer[n];
		for(int i=0;i<n;i++) cranes[i] = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Integer[] boxes = new Integer[m];
		for(int i=0;i<m;i++) boxes[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(cranes,Collections.reverseOrder());
		Arrays.sort(boxes,Collections.reverseOrder());
		
		if(boxes[0] > cranes[0]) {
			System.out.println(-1);
			return;
		}
		
		int cnt = 0, day = 0;
		boolean[] visit = new boolean[m];
		int[] position = new int[n];
		
		while(cnt < m) {
			
			for(int i=0;i<n;i++) {
				while(position[i] < m) {
					if(boxes[position[i]] <= cranes[i] && !visit[position[i]]) {
						visit[position[i]] = true;
						cnt++;
						position[i]++;
						break;
					}
					position[i]++;
				}
			}
			day++;
		}
		System.out.println(day);
 */
}
