import java.util.*;

class Solution{
    public int solution(String s){
        int answer = 0;
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        st.push(c[0]);
        
        for(int i=1; i<c.length; i++){
            if(!st.isEmpty() && c[i]==st.peek()) st.pop();
            else st.push(c[i]);
        }
        
        if(st.size()==0) answer=1;
        
        return answer;
    }
}