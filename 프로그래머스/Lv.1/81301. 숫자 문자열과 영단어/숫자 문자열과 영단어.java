import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String Sanswer = new String();
        StringBuilder sb = new StringBuilder();
        String[] arr = {"zero",
                        "one",
                        "two",
                        "three",
                        "four",
                        "five",
                        "six",
                        "seven",
                        "eight",
                        "nine",
                       };

        for(char c: s.toCharArray()){
            if(Character.isDigit(c)) Sanswer+=c;
            else{
                sb.append(c);
                for(int i=0; i<10; i++){
                    if(sb.toString().equals(arr[i])){
                        Sanswer+=i;
                        sb.delete(0,sb.length());
                    }
                }
            }
        }
        answer = Integer.parseInt(Sanswer);
        
        return answer;
    }
}