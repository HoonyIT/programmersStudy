import java.util.*;

class Solution {
    int answer=0, sum;
    
    public void DFS(int L, int sum, int n, int[] numbers,int index, int target){
        if(L==n){
            if(sum==target) answer++;
        }
        else{
            DFS(L+1, sum+numbers[index], n, numbers, index+1, target);
            DFS(L+1, sum-numbers[index], n, numbers, index+1, target);
        }
    }
    
    public int solution(int[] numbers, int target) {
        int n = numbers.length;
        
        DFS(0,0,n,numbers,0,target);
        
        return answer;
    }
}