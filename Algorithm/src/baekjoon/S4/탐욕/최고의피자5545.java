package baekjoon.S4.탐욕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최고의피자5545 {
/*
public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int pizza = Integer.parseInt(st.nextToken());
		int topping = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		int dou = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		int kal;
		int answer = dou / pizza;
		
		for(int i=1;i<=n;i++) {
			kal = dou;
			for(int j=0;j<i;j++) {
				kal += arr[n-j-1];
			}
//			System.out.println("[price, kal, result, answer]: "+(pizza+topping*i)+","+kal+","+(kal/(pizza+topping*i))+","+answer);
			kal /= (pizza + topping * i);
			if(kal > answer) answer = kal;
		}
		System.out.println(answer);
	}
 */
}
