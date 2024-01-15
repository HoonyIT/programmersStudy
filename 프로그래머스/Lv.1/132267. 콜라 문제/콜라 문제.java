import java.util.*;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>=a){
            answer+=(b*(n/a));
            
            n = n-(a*(n/a))+(b*(n/a));
            // System.out.println(n);
            // System.out.println(answer);
        }
        
        return answer;
    }
}