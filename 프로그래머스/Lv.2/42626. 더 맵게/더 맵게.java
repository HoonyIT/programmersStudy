import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        
        for(int x: scoville) PQ.offer(x);
        
        while(!PQ.isEmpty()){
            int tmp1 = PQ.poll();
            if(tmp1>=K) {
                PQ.offer(tmp1);
                break;
            }
            else if(tmp1<K && !PQ.isEmpty()){
                answer++;
                PQ.offer(tmp1+(PQ.poll()*2));
            }
        }
        
        if(PQ.isEmpty()) answer=-1;
        
        return answer;
    }
}