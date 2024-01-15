import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        int sum = 0;
        PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int w: works) {
            sum+=w;
            Q.offer(w);
        }
        if(sum<=n) return 0;
        
        while(n!=0){
            Q.offer(Q.poll()-1);
            n--;
        }
        
        while(!Q.isEmpty()){
            int tmp = Q.poll();
            answer += tmp*tmp;
        }
        
        return answer;
    }
}