import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        
        for(char x : s.toCharArray()){
            if(x=='(') stack.push(x);
            else {
                if(stack.isEmpty())return false; //닫는 괄호 많은 경우
                stack.pop();
            }
        }      
        if(!stack.isEmpty())return false; //여는 괄호 많은 경우

        return answer;
    }
}