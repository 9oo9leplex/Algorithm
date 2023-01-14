package baekjoon.S4.탐욕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전o11047 {
/*
public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		
		int[] coins = new int[n];
		for(int i=0;i<n;i++) coins[i] = Integer.parseInt(br.readLine());
		int val, answer = 0;
		
		for(int i=n-1;i>=0;i--) {
			
			if(coins[i] > target) continue;
			val = target / coins[i];
			answer += val;
			target -= coins[i] * val;
//			System.out.println("[coin,val,target]: ["+coins[i]+","+val+","+target+"]");
			if(target == 0) break;
		}
		System.out.println(answer);
	}
 */
}
