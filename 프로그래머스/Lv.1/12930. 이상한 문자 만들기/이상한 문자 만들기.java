import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 1;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                if(cnt%2 == 0) answer += Character.toLowerCase(s.charAt(i));
                else answer += Character.toUpperCase(s.charAt(i));
                cnt++;
            }
            else {
                answer += s.charAt(i);
                cnt=1;
            }
        }
        return answer;
    }
}