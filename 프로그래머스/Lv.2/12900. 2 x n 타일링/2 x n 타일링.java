class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] dy = new int [n+1];
        dy[0] = 1;
        dy[1] = 2;
        for(int i=2; i<n+1; i++){
            dy[i] = (dy[i-2] + dy[i-1]) % 1000000007;
        }
        answer = dy[n-1];
        return answer;
    }
}