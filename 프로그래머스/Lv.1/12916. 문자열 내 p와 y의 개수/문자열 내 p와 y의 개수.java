import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String str = s.toUpperCase();
        int pcnt = 0;
        int ycnt = 0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='P') pcnt ++;
            else if(str.charAt(i)=='Y') ycnt ++;
        }
        if(pcnt != ycnt) answer = false;
        

        return answer;
    }
}