class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row=arr1.length;
        int mid=arr1[0].length;
        int col=arr2[0].length;
        
        int[][] answer = new int[row][col];
        
        for(int k=0; k<col; k++){
            for(int i=0; i<row; i++){
                int sum=0;
                for(int j=0; j<mid; j++){
                    sum+= arr1[i][j]*arr2[j][k];
                }
                answer[i][k] = sum;
            }
        }
        
        return answer;
    }
}