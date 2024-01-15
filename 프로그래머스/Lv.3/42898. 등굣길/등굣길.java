import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        //각 위치별 올 수 있는 수
        int[][] DP = new int[n+1][m+1]; //3,4
        DP[1][1] = 1;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                int ck=0;
                if(i==1 && j==1) continue;
                for(int k=0; k<puddles.length; k++){
                    if(puddles[k][0]==j && puddles[k][1]==i){
                        ck++;
                        break;
                    } //웅덩이
                }
                if(ck!=0) continue;
                DP[i][j] = (DP[i-1][j] + DP[i][j-1]) % 1000000007;
            }
        }

        answer = DP[n][m] % 1000000007;
        
        return answer;
    }
}