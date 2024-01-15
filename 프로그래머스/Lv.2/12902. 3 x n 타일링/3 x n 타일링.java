import java.util.*;
class Solution {   
    int answer = 0;

    public int solution(int n) {
        // # f(4) = f(2) * f(2) + 2 
        // # f(6) = f(2) * f(4) + 2 * f(2) + 2
        // # f(8) = f(2) * f(6) + 2 * f(4) +  2 * f(2) ...
        
        if(n%2!=0) return 0;
        if(n==2) return 3;
        
        long[] dp = new long[n+1];
        dp[0]=1;
        dp[2]=3;
        
        for(int i=4; i<=n; i+=2){
            dp[i] = 3*dp[i-2];
            for(int j=i-4; j>=0; j-=2){
                dp[i] += 2*dp[j];
            }
            dp[i]%=1000000007;
        }


        return (int)dp[n];
    }
}