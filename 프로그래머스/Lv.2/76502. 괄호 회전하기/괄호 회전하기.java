import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0; i<s.length(); i++){ //회전 횟수
            Stack<Character> st = new Stack<>();
            
            for(int j=0; j<sb.length(); j++){
                char tmpC = sb.charAt(j);
                
                if(st.isEmpty()) st.push(tmpC);
                else if(
                   st.peek()=='(' && tmpC==')' ||
                   st.peek()=='{' && tmpC=='}' ||
                   st.peek()=='[' && tmpC==']'  )
                {
                    st.pop();
                } 
                else st.push(tmpC);
            }
            
            if(st.size()==0) answer++;
            
            String tmp = sb.substring(0,1);
            sb.delete(0,1);
            sb.append(tmp);
        }
        
        return answer;
    }
}