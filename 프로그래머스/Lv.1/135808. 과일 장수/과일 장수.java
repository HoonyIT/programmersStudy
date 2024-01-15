import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int len = score.length;
        Arrays.sort(score);
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        
        for(int i=score.length-1; i>=0; i--){
            PQ.offer(score[i]);
            if(PQ.size()==m){
                answer+=(PQ.poll()*m);
                PQ.clear();
                len-=m;
                if(len<m) break;
            }
        }
        
        
        
        return answer;
    }
}