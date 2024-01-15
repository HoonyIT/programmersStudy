import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        

        for(int i=0; i<citations.length; i++){
            int h=citations.length-i;
            /* 
            citations[i] : [0,1,3,5,6]
            h            : [5,4,3,2,1]
            */
            if(citations[i]>=h){
                /* citations[i]>=h?
                   h번 이상 인용된 논문의 수가 h편 이상인가?
                */
                answer=h;
                break;
            }
        }
        
        return answer;
    }
}