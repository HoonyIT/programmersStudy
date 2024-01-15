class Solution {
    public int solution(int n) {
        int answer = 0;
        //index를 숫자로 이해하는게 Tip.
        int[] check = new int[n+1];
        
        for(int i=2; i<n+1; i++){
            if(check[i]==0) {
                answer++;
                for(int j=i; j<n+1; j+=i){
                    check[j] = 1;
                }
            }
        }
        return answer;
    }
}