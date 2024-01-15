import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pQ = new PriorityQueue();
        
        if(k<=score.length){
            for(int i=0; i<k; i++){
                pQ.offer(score[i]);
                answer[i]=pQ.peek();
            }

            for(int i=k; i<score.length; i++){
                if(pQ.peek()<score[i]) {
                    pQ.poll();
                    pQ.offer(score[i]);
                }
                answer[i]=pQ.peek();
            }
        }
        else{
            for(int i=0; i<score.length; i++){
                pQ.offer(score[i]);
                answer[i]=pQ.peek();
            }
        }
            
        return answer;
    }
}