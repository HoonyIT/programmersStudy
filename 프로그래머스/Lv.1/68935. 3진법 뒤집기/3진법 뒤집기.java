import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = "";
        
        
        while(n/3>0){
            s+=(n%3);
            n/=3;
        }
        s+=(n%3);
        // System.out.println(s);
        answer = Integer.parseInt(s,3);
        return answer;
    }
}