import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] d = new int[triangle.length][triangle.length];
        
        d[0][0] = triangle[0][0];

        for(int i=0; i<triangle.length-1; i++){ //행
            for(int j=0; j<triangle[i].length; j++){
                int left = d[i][j] + triangle[i+1][j];
                int right = d[i][j] + triangle[i+1][j+1];
                
                if(left>d[i+1][j]) d[i+1][j] = left;
                if(right>d[i+1][j+1]) d[i+1][j+1] = right;
                answer = Math.max(answer,left);
                answer = Math.max(answer,right);
            }
        }
        

        
        return answer;
    }
}