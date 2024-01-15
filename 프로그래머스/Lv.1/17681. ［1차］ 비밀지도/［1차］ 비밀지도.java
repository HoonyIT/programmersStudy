import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            answer[i]="";
        }

        int[][] a1 = new int[n][n];
        int[][] a2 = new int[n][n];
        

        for(int i=0; i<n; i++){
            int tmp1 = arr1[i];
            int tmp2 = arr2[i];
            for(int j=n-1; j>=0; j--){
                a1[i][j] = (tmp1 % 2);
                tmp1 /= 2;
                
                a2[i][j] = (tmp2 % 2);
                tmp2 /= 2;
            }
            for(int j=0; j<n; j++){
                if(a1[i][j]==0 && a2[i][j]==0) answer[i] += " ";
                else answer[i]+= "#";
            }
        }
    
        return answer;
    }
}