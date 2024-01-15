import java.util.*;

class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        long D = (long)d*d;

        
        for(int i=0; i<=d; i+=k){
            answer++; //x축
            long tmp = (long)i*i;

            answer += (long)Math.sqrt((D-tmp))/k;
        }
        
        return answer;
    }
}