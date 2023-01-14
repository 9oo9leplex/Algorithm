package baekjoon.S3.탐욕;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬만들기1213 {
/*
public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		for(char c : br.readLine().toCharArray()) arr[c - 'A']++;
		
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		char mid = 'A';
		int len = 0;
		
		for(int i=0;i<26;i++) {
			if(arr[i] % 2 == 1) {
				mid = (char)(65 + i);
				cnt++;
			}
			if(cnt >= 2) {
				System.out.println("I'm Sorry Hansoo");
				return;
			}
			len = sb.length();
			for(int j=0;j<arr[i]/2;j++) {
				sb.insert(len/2, (char)(65+i));
				sb.insert(len/2+1,(char)(65+i));
			}
		}
		
		if(cnt == 1) {
			len = sb.length();
			sb.insert(len/2, mid);
		}
		System.out.println(sb);
	}
 */
}
