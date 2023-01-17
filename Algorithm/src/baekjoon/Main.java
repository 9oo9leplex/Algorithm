package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		int i;
		for(i=n-1;i>1;i--) {
			if(arr[i] < arr[i-1] + arr[i-2]) break;
		}
		
		if(i != 1) System.out.println(arr[i] + arr[i-1] + arr[i-2]);
		else System.out.println(-1);
	}
}























