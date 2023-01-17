package baekjoon.S4.탐욕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class YonseiTOTO12018 {
/*
public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n], tmp[];
		int p,s;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			p = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			
			if(p < s) {
				arr[i] = 1;
				continue;
			}
			
			tmp = new int[p];
			for(int j=0;j<p;j++) tmp[j] = Integer.parseInt(st.nextToken());
			Arrays.sort(tmp);
			
			arr[i] = tmp[p-s];
		}

		Arrays.sort(arr);
		int answer = 0;
		for(int i=0;i<n;i++) {
			m -= arr[i];
			if(m < 0) break;
			answer++;
		}
		System.out.println(answer);
	}
 */
}
