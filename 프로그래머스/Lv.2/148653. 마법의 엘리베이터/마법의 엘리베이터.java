import java.util.*;
class Solution {
    public int solution(int storey) {
        int answer = 0;
        char[] c = String.valueOf(storey).toCharArray();
        Stack<Integer> st = new Stack<>();

        for(char ch: c) st.push(ch-48);
        
        while(st.size()>=2){
            int tmp = st.pop();
            
            if(tmp==10) st.push((st.pop()+1));
            else if(tmp>5) {
                answer += 10-tmp;
                st.push((st.pop()+1));
            }
            else if(tmp<5) answer += tmp;
            else{
                if(st.peek() >= 5) {
                    answer += 10-tmp;
                    st.push((st.pop()+1));
                }
                else answer += tmp;
            }
        }
        
        int test = st.pop();
        if(test==10) answer++;
        else if(test>5) answer+=10-test+1;
        else answer+=test;

        
        return answer;
    }
}