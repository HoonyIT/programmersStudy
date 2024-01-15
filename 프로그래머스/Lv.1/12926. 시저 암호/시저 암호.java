class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String st = "abcdefghijklmnopqrstuvwxyz"; //26개
        
        for(char x: s.toCharArray()){
            if(x == ' ') answer += " ";
            else{
                if(st.indexOf(x) != -1){ //소문자
                    answer += st.substring((st.indexOf(x) + n)%26,((st.indexOf(x) + n)%26)+1);
                }
                else{
                    answer += st.toUpperCase().
                                substring(
                                (st.toUpperCase().indexOf(x) + n)%26,
                                ((st.toUpperCase().indexOf(x) + n)%26)+1
                                );
                }
            }
        }
        return answer;
    }
}