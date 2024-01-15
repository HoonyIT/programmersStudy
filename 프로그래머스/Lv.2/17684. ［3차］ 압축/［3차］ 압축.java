import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String msg) {
        String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<word.length(); i++) st.push(word.substring(i,i+1));
        
        for(int i=0; i<msg.length(); i++){
            sb.append(msg.charAt(i));
            
            if(st.contains(sb.toString())) continue;
            else{
                String tmp = sb.substring(0,sb.length()-1);
                answer.add((st.size()-st.search(tmp)+1)); //출력
                st.push(sb.toString());     //사전에 기입
                sb.replace(0,sb.length()-1,""); 
            }
        }
        answer.add((st.size()-st.search(sb.toString())+1));
        
        return answer;
    }
}