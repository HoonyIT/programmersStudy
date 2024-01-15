class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum=0;
        for(int i=0; i<count; i++){
            sum+=price*(1+i);
        }
        
        if(sum-money>0) answer = sum - (long)money;
        else answer = 0;
        
        return answer;
    }
}