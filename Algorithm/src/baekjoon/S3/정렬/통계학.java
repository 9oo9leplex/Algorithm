package baekjoon.S3.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 통계학 {
/*
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());		
		int[] arr = new int[n];
		int sum = 0;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		List<Map.Entry<Integer,Integer>> entry = new ArrayList<>(hm.entrySet());
		entry.sort((o1,o2) -> {
			if(o2.getValue() == o1.getValue()) return o1.getKey() - o2.getKey();
			return o2.getValue() - o1.getValue();
		});
		StringBuilder sb = new StringBuilder();
		
		sb.append(Math.round((double)sum / n)).append("\n");
		sb.append(arr[n/2]).append("\n");
		if(n > 1) {
			if(entry.get(0).getValue() == entry.get(1).getValue()) sb.append(entry.get(1).getKey());
			else sb.append(entry.get(0).getKey());
			sb.append("\n");
			sb.append(arr[n-1] - arr[0]);
		}
		else {
			sb.append(arr[0]).append("\n");
			sb.append(0);
		}
		
		System.out.println(sb);
	}
 */
}
