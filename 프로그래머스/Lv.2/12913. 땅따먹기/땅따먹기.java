import java.util.*;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        //DP : 각 위치에서의 최대값을 저장
        int[][] DP = new int[land.length][4];
        
        for(int i=0; i<4; i++) DP[0][i] = land[0][i];
        
        for(int i=1; i<land.length; i++){
            for(int j=0; j<4; j++){
                for(int k=0; k<4; k++){
                    if(k!=j && DP[i][j] < DP[i-1][k] + land[i][j])
                        DP[i][j] = DP[i-1][k] + land[i][j];
                }
            }
        }
        
        for(int i=0; i<4; i++){
            answer = Math.max(answer, DP[land.length-1][i]);
        }

        return answer;
    }
}