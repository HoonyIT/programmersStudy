class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        
        if(a!=1){            
            for(int i=0; i<a-1; i++){
                b += date[i];
            }
            answer += day[b%7];
        }
        else{
            answer += day[b%7];
        }
        
        
        return answer;
    }
}