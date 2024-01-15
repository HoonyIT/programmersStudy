import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        //반복문 사용시 시간초과
        double i = Math.sqrt(n); //제곱근
        if(i%1==0)  answer = (long) Math.pow(i+1,2); //제곱
        else answer = -1;
        
        return answer;
    }
}