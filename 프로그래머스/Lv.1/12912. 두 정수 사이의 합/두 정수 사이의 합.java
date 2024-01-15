import java.util.*;

class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        
        if(b-a>0){
            for(long i=a; i<=b; i++){
                answer += i;
            }
        }
        else if(b-a<0){
            for(long i=b; i<=a; i++){
                answer += i;
            }
        }
        else answer = b;
        
        return answer;
    }
}