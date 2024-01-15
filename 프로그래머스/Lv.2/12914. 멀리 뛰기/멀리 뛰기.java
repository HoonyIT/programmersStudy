import java.util.*;
class Solution {
    
    public long solution(int n) {
        long answer = 0;
        int[] arr = new int [n];
        if(n<3) return n;
        arr[0]=1;
        arr[1]=2;
        
        for(int i=2; i<n; i++){
            arr[i]=(arr[i-2]+arr[i-1])%1234567;
        }
        
        answer = arr[n-1];
        
        
        return answer;
    }
}