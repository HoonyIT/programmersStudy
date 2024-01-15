import java.util.*;

class dis implements Comparable<dis>{
    int s;
    int e;
    public dis(int s, int e){
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(dis d){
        return this.e-d.e;
    }
}

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        PriorityQueue<dis> PQ = new PriorityQueue<>();
        
        for(int i=0; i<routes.length; i++){
            PQ.offer(new dis(routes[i][0],routes[i][1]));
        }
        
        if(PQ.size()==1) return 1;
        int end = PQ.poll().e;
        
        while(!PQ.isEmpty()){
            if(end<PQ.peek().s){
                answer++;  
                end= PQ.poll().e; //설치 후 end지점 변경
            } 
            else {
                PQ.poll(); //설치될 최대 수 까지 poll
            }   
            if(PQ.isEmpty()) answer++;
        }
        
        
        
        return answer;
    }
}