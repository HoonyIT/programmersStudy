import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zerocnt=0;
        int Bcnt=0;
        
        while(!s.equals("1")){
            String x = s.replace("0","");
            zerocnt+= s.length()-x.length();
            s = Integer.toBinaryString(x.length());
            Bcnt++;
        }
        
        answer[0] = Bcnt;
        answer[1] = zerocnt;

        return answer;
    }
}