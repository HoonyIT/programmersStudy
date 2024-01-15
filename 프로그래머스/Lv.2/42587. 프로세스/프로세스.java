import java.util.*;
class Solution {
    
    static class pz{
        int index;
        int priorities;
        public pz(int index, int priorities){
            this.index = index;
            this.priorities = priorities;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<pz> Que = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++){
            Que.offer(new pz(i,priorities[i]));
        }
        while(!Que.isEmpty()){
            pz tmp = Que.poll();
            for(pz x: Que){
                if(tmp.priorities<x.priorities){
                    Que.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                if(tmp.index==location) return answer;
                else answer++;
            }
        }
        
        return answer;
    }
}