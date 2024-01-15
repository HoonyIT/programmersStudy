import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        int cnt = 0;
        long sum1=0, sum2=0;
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();
        
        for(int i=0; i<queue1.length; i++) {
            Q1.offer(queue1[i]);
            Q2.offer(queue2[i]);
            sum1+= queue1[i];
            sum2+= queue2[i];
        }
        if((sum1+sum2)%2!=0) return answer;

        
        for(int i=0; i<(queue1.length+1)*2; i++){
            if(sum1>sum2){
                int tmp = Q1.poll();
                Q2.offer(tmp);
                sum1-=tmp;
                sum2+=tmp;
            }
            else if(sum1<sum2){
                int tmp = Q2.poll();
                Q1.offer(tmp);
                sum1+=tmp;
                sum2-=tmp;
            }
            else return cnt;
    
            cnt++;
        }
        //마지막 턴 확인
        if(sum1==sum2) return cnt;
        
        return answer;
    }
}