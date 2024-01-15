class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tot = 0;
        
        for(int i=x; i>0; i/=10){
            tot += i%10;
        }
        if(x%tot!=0) answer = false; 
        
        return answer;
    }
}