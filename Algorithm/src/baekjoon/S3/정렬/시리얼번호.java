package baekjoon.S3.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 시리얼번호 {
/*
static class Node implements Comparable<Node>{
		String str;
		int val;
		
		public Node(String str, int val) {
			this.str = str;
			this.val = val;
		}
		
		@Override
		public int compareTo(Node o) {
			if(this.str.length() == o.str.length()) {
				if(this.val == o.val) return this.str.compareTo(o.str);
				return this.val - o.val;
			}
			return this.str.length() - o.str.length();
		}

		@Override
		public String toString() {
			return "Node [str=" + str + ", val=" + val + "]";
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(br.readLine());		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		String str;
		int sum;
		for(int i=0;i<n;i++) {
			str = br.readLine();
			sum = 0;
			for(char c : str.toCharArray()) {
				if(c - '0' >= 0 && c - '0' <= 9) sum += c - '0';
			}
			pq.add(new Node(str,sum));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) sb.append(pq.poll().str).append("\n");
		System.out.println(sb);
	}
 */
}
