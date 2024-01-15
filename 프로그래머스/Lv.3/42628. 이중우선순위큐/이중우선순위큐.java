import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> pq_max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq_min = new PriorityQueue<>();
        
        for(String s: operations){
            String[] o = s.split(" ");
            int num = Integer.parseInt(o[1]);
            if(o[0].equals("I")){
                pq_max.offer(num);
                pq_min.offer(num);
            }
            else {
                if(pq_max.size()==0) continue; //한 큐가 빌경우 다른 큐도 빔
                
                if(num==1){
                    // if(pq_max.size()==0) continue;
                    int tmp = pq_max.poll();
                    pq_min.remove(tmp);
                }
                else{
                    // if(pq_min.size()==0) continue; 
                    int tmp = pq_min.poll();
                    pq_max.remove(tmp);
                }
            }
        }
        
        if(pq_max.size()!=0){
            answer[0] = pq_max.poll();
            answer[1] = pq_min.poll();
        }
        
        return answer;
    }
}