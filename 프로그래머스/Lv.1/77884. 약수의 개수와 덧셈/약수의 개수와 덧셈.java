class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 1;
        
        for(int i=0; i<=right-left; i++){
            
           for(int j=2; j<=left+i; j++){
               if((left+i)%j==0) count++;
           }
            
            if(count%2==0) answer+=left+i;
            else answer+= -1*(left+i);
            
            count=1;
        }
        
        return answer;
    }
}