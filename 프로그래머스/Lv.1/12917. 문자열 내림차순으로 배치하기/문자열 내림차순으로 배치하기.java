import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String c = "abcdefghijklmnopqrstuvwxyz";
        String tmp = new StringBuilder(c).reverse().toString();
        
        for(char x : tmp.toCharArray()){
            for(char y : s.toCharArray()){
                if(x==y) answer+=y;
            }
        }
        for(char x : tmp.toCharArray()){
            for(char y : s.toCharArray()){
                if(Character.toUpperCase(x)==y) answer+=y;
            }
        }
        return answer;
    }
}