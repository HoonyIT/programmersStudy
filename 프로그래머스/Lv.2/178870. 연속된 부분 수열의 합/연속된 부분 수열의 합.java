import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        //투포인터
        int lt = 0;
        int sum = 0;
        int MinSize = Integer.MAX_VALUE;
        
        for(int rt=0; rt<sequence.length; rt++){
            sum+=sequence[rt];
            if(sum<k) continue;
            else if(sum>k){
                while(sum>k){
                    sum-=sequence[lt];
                    lt++;
                }
            }
            
            if(sum==k){
                if(MinSize>rt-lt){
                    answer[0]=lt;
                    answer[1]=rt;
                    MinSize=rt-lt;
                }
            }
        }

        return answer;
    }
}