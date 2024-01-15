import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        for(int i=1; i<section.length; i++){
            int a = start + m; //range
            
            if(section[i]>=a){
                answer++;
                start = section[i];
            }
        }
        
        return answer;
    }
}