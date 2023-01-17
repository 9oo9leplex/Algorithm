package baekjoon.S4.탐욕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 햄버거분배19941 {
/*
public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		char[] arr = br.readLine().toCharArray();
		int answer = 0;
		boolean flag;
		
		for(int i=0;i<n;i++) {
			if(arr[i] == 'P') {
				
				flag = false;
				
				for(int j=k;j>0;j--) {
					if(i-j >= 0  && arr[i-j] == 'H') {
						arr[i-j] = 'X';
						answer++;
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					for(int j=1;j<=k;j++) {
						if( i+j < n && arr[i+j] == 'H') {
							arr[i+j] = 'X';
							answer++;
							break;
						}
					}					
				}
				
			}
		}
		System.out.println(answer);
		
	}
 */
}
