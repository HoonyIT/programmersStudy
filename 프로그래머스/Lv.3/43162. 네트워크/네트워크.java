import java.util.*;

class Solution {
    boolean[] visit;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];
        
        for(int i=0; i<computers.length; i++){
            if(!visit[i]){
                visit[i] = true;
                answer++;
                DFS(i, computers);
            }
        }
        
        return answer;
    }
    
    public void DFS(int idx, int[][] computers) {
        for(int j=0; j<computers[idx].length; j++){
            if(idx!=j && !visit[j] && computers[idx][j]==1){
                visit[j]=true;
                DFS(j, computers);
            }
        }
    }
}