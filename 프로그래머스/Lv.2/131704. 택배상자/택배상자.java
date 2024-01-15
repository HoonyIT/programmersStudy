import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int I = 0;
        
        for(int i=0; i<order.length; i++){
            if(i+1 == order[I]) {
                answer++;
                I++;
            }
            else {
                st.push(i+1);
            }   
            
            while(!st.isEmpty()){
                if(st.peek()==order[I]){
                    st.pop();
                    answer++;
                    I++;
                }
                else break;
            }
        }
        
        return answer;
    }
}