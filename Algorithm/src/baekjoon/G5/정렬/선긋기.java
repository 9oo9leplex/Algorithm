package baekjoon.G5.정렬;

public class 선긋기 {
/*
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());		
		int[][] arr = new int[n][2];
		
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr,(o1,o2) -> {
			if(o1[0] == o2[0]) return o1[1] - o2[1];
			return o1[0] - o2[0];
		});
		
		int start = arr[0][0], end = arr[0][1];
		int sum = 0;
		for(int i=1;i<n;i++) {
			
			if(end >= arr[i][0] ) end = Math.max(end, arr[i][1]);
			else {
				sum += end - start;
				start = arr[i][0];
				end = arr[i][1];
			}
		}
		
		sum += end - start;
		
		System.out.println(sum);
	}
 */
}
