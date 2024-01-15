class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        if(n==1) return "1";
        if(n==2) return "2";
        if(n==3) return "4";
        
        while(n>3){
            if(n%3==1) {
                sb.append("1");
                n/=3;
            }
            else if(n%3==2) {
                sb.append("2");
                n/=3;
            }
            else{ 
                sb.append("4"); 
                n = n/3-1;
            }
            
        }
        if(n%3==1) sb.append("1");
        else if(n%3==2) sb.append("2");
        else sb.append("4");
        
        answer = sb.reverse().toString();
        return answer;
    }
}