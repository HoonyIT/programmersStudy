class Solution {
    public int[] solution(long n) {
        int cnt = 0;
        for(long i=n; i>0; i/=10){
            cnt++;
        }
        int[] answer = new int[cnt];
        
        cnt = 0;
        for(long i=n; i>0; i/=10){
            answer[cnt] = (int) (i%10); 
            // i%10을 괄호해서 long으로 연산먼저 해줘야함.
            cnt++;
        }
        //★ int i=(int)n으로 해버리면 n이 최대값일 때 잘려서 int형태가 됨!!
        return answer;
    }
}
