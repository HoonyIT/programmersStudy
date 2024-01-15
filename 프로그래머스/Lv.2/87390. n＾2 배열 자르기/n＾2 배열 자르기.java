import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        //TIP! (R,C) 에서 큰 값이 들어온다..
        //    EX) (1,4)=4 , (3,2)=3
        
        int index = 0;
        for(long i=left; i<=right; i++){
            answer[index++] = (int) Math.max(i/n,i%n) +1;
        }
        
        return answer;
    }
}