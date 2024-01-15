import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        
        for(int j=0; j<=t.length()-size; j++){
            String tmp = t.substring(j,j+size);
            if(Long.parseLong(tmp) <= Long.parseLong(p)) answer++;
        }
        
        
        return answer;
    }
}