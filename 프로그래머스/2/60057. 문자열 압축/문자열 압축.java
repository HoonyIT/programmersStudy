import java.util.*;

class Solution {
    public int solution(String s) {
        if(s.length()==1) return 1;
        
        int answer = Integer.MAX_VALUE-1;
        for(int i=1; i<=s.length()/2; i++){ //Unit
            StringBuilder SB = new StringBuilder();
            StringBuilder check = new StringBuilder(s.substring(0,i));
            int cnt = 1;
            int k = i;
            while(k<s.length()){
                //Last Point
                if(k+i>=s.length()){
                    int lastcnt=0;
                    if(k+i==s.length() && s.substring(k,k+i).equals(check.toString())) lastcnt++;
                    if(lastcnt==1){
                        SB.append(String.valueOf(cnt+1));
                        SB.append(check);
                    }
                    else if(cnt>1){
                        SB.append(String.valueOf(cnt));
                        SB.append(check);
                        SB.append(s.substring(k));
                    }
                    else{
                        SB.append(check);
                        SB.append(s.substring(k));
                    }
                    break;
                }
                
                //another
                if(s.substring(k,k+i).equals(check.toString())){
                    cnt++;
                }
                else{
                    if(cnt>1){
                        SB.append(String.valueOf(cnt));
                        cnt=1;
                    }
                    SB.append(check);
                    check.delete(0, check.length());
                    check.append(s.substring(k,k+i));
                }
                k+=i;
            }
            answer=Math.min(answer, SB.length());
        }
        return answer;
    }
}