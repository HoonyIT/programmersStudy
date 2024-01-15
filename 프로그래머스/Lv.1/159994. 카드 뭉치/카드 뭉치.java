import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int ltidx = 0;
        int rtidx = 0;
        for(String x: goal){
            if(ltidx<cards1.length && x.equals(cards1[ltidx])) ltidx++;
            else if(rtidx<cards2.length && x.equals(cards2[rtidx])) rtidx++;
            else return "No";
        }
        
        return answer;
    }
}