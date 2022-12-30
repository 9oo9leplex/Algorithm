package programmers.kakaointern.level1;

public class 실패율 {
/*
import java.util.*;
class Solution {
    
    static class Stage implements Comparable<Stage>{
        int idx;
        double avg;
        
        public Stage(int idx, double avg){
            this.idx = idx;
            this.avg = avg;
        }
        
        @Override
        public int compareTo(Stage o){
            if(this.avg == o.avg) return this.idx - o.idx;
            else if(this.avg > o.avg) return -1;
            else return 1;
        }
    }
    
    public int[] solution(int N, int[] stages) {
        
        
        int[] onStage = new int[N+1];
        int[] cleared = new int[N+1];
        int tmp;
        
        for(int stage : stages){
            tmp = stage;
            if(stage > N) tmp = N;
            for(int i=1;i<=tmp;i++){
                cleared[i]++;
            }
            if(stage > N) continue;
            onStage[stage]++;
        }
        
        System.out.println(Arrays.toString(onStage));
        System.out.println(Arrays.toString(cleared));
        
        PriorityQueue<Stage> pq = new PriorityQueue<>();
        for(int i=1;i<=N;i++){
            if(cleared[i] == 0) pq.add(new Stage(i,0.0));
            else pq.add(new Stage(i,(double)onStage[i]/cleared[i]));
        }
        
        tmp = 0;
        int[] answer = new int[N];
        while(!pq.isEmpty()) answer[tmp++] = pq.poll().idx;
        
        
        return answer;
    }
}
 */
}
