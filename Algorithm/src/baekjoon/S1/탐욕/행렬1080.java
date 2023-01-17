package baekjoon.S1.탐욕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬1080 {
/*
public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m], brr = new int[n][m];
		char[] crr;
		
		for(int i=0;i<n;i++) {
			crr = br.readLine().toCharArray();
			for(int j=0;j<m;j++) {
				arr[i][j] = crr[j] - '0';
			}
//			System.out.println(Arrays.toString(arr[i]));
		}
//		System.out.println();
		for(int i=0;i<n;i++) {
			crr = br.readLine().toCharArray();
			for(int j=0;j<m;j++) {
				brr[i][j] = crr[j] - '0';
			}
//			System.out.println(Arrays.toString(brr[i]));
		}
		
		int cnt = 0;
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<m-2;j++) {
				if(arr[i][j] != brr[i][j]) {
					cnt++;
					for(int r=i;r<i+3;r++) {
						for(int c=j;c<j+3;c++) {
							if(r >= n || c >= m) continue;
							arr[r][c] = arr[r][c] == 1 ? 0 : 1;
						}
					}
				}
			}
		}
		
		boolean flag = false;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j] != brr[i][j]) {
					flag = true;
					break;
				}
			}
			if(flag) break;
		}
		
		if(flag) System.out.println(-1);
		else System.out.println(cnt);
	}
 */
}
