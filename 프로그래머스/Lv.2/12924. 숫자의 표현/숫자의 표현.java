import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 1, lt=0, sum=0;
        int[] arr = new int[n/2+1];
        
        if(n==1 || n==2) return answer;
        
        for(int i=0; i<arr.length; i++) arr[i] = i+1;
        
        for(int rt=0; rt<n/2+1; rt++){
            sum+=arr[rt];
            if(sum==n) answer++;
            while(sum>=n){
                sum-=arr[lt++];
                if(sum==n) answer++;
            }
        }
        
        return answer;
    }
}