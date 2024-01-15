import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] tmp = s.toCharArray();
        
        if(s.length()%2==0) {
            int middle = s.length()/2;
            for(int i=1; i>=0; i--){
            answer+= tmp[middle-i] ;
            }
            //answer+= tmp[middle-1]+""+tmp[middle];
        }
        else {
            int middle = s.length()/2;
            answer+= tmp[middle];
        }
        return answer;
    }
}