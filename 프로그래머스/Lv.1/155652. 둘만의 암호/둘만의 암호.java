import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String Alpha = "abcdefghijklmnopqrstuvwxyz";
        Queue<Character> Q = new LinkedList<>();
        

        for(char x: skip.toCharArray()) Q.offer(x);
        
        for(char y: s.toCharArray()){
            int i = index, j=Alpha.indexOf(y);

            while(i>0){
                j++;
                if(j>=Alpha.length()) j=0;
                if(!Q.contains(Alpha.charAt(j))) i--;
            }
            
            answer+=Alpha.charAt(j);
        }
        
        
        return answer;
    }
}