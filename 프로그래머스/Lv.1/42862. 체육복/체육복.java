import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] check = new int[n+1];
        
        for(int i=1; i<n+1; i++){
            check[i] = 1;
        }
        

        for(int i=0; i<reserve.length; i++){
            check[reserve[i]] += 1;
        }
        
        for(int i=0; i<lost.length; i++){
            check[lost[i]] -= 1;
        }
        
        for(int i=1; i<n+1; i++){
            if(check[i]==0){
                if(check[i-1]>1){
                    check[i] +=1;
                    check[i-1] -=1;
                }
                else if(i!=n && check[i+1]>1){
                    check[i] +=1;
                    check[i+1] -= 1;
                }
            }
        }
        
        for(int i=1; i<n+1; i++){
            if(check[i] != 0) answer++;
        }
        
        return answer;
    }
}