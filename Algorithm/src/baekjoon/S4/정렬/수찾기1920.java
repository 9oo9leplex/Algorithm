package baekjoon.S4.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기1920 {
/*
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());		
		int a[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) a[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(a);
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) sb.append(binarySearch(n,Integer.parseInt(st.nextToken()),a)).append("\n");
		
		System.out.println(sb);
	}
	
	private static int binarySearch(int n, int cur, int[] arr) {
		
		int l = 0, r = n-1,mid;
		
		while(l <= r) {
			mid = (l + r) / 2;
			if(arr[mid] < cur) l = mid + 1;
			else if(arr[mid] > cur)	r = mid - 1;
			else return 1;
		}
		return 0;
	}
 */
}
