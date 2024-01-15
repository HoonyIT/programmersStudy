class Solution {
    int[] answer;
    public int[] solution(int n, int s) {
        if(s<n) {
            return new int[]{-1};
        }
        answer = new int[n];
        
        //중앙값을 계속 넣으면 됨
        for(int i=0; i<n; i++){
            answer[i] = s/(n-i);
            s-=answer[i];
        }
        
        return answer;
    }
}