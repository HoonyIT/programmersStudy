import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        // String answer = "";
        char[] c = s.toCharArray();
        int ch = 0;
        
        for(char x: c){
            if(x==' ') ch=0;
            else{
                if(ch==0){ //첫 글자
                    if(Character.isAlphabetic(x)){
                        x = Character.toUpperCase(x);
                    }
                    ch++;
                }
                else{
                    x = Character.toLowerCase(x);
                }
            }
            answer.append(x);
        }

        
        return answer.toString();
    }
}