package baekjoon.G5.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] arr = new long[n];
		for(int i=0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		long target;
		int nl,nr,l = 0, r = n - 1;
		long compare = Math.abs(arr[l] + arr[r]);
		nl = l;
		nr =r ;
		
//		for(int j=l;j<n;j++) {
//			if(cur > 0) break;
		while(nl < nr) {
//			for(int i=r;i>=0;i--) {
//				if(j == i) break;
				target = arr[nl] + arr[nr];
//				System.out.println("[cur,val,target,compare]: ["+arr[l]+","+arr[r]+","+Math.abs(target)+","+compare+"]");
				if(Math.abs(target) < compare) {
					compare = Math.abs(target);
					l = nl;
					r = nr;
					
					if(target == 0) break;
				}

				if(target > 0) nr--;
				else nl++;
		}
		System.out.println(arr[l] + " " + arr[r]);
	}
}
