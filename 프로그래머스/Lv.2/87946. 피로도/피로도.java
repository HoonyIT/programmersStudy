import java.util.*;

class Solution {
    int[] ch;
    int N;
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        ch = new int[dungeons.length];
        N = dungeons.length;
        
        DFS(0,k,dungeons);
        
        // if(answer == 0) answer= -1;
        return answer;
    }
    
    public void DFS(int L, int k, int[][] dungeons){
        for(int i=0; i<N; i++){
            if(k>= dungeons[i][0] && ch[i]==0){
                ch[i]=1;
                DFS(L+1, k-dungeons[i][1], dungeons);
                ch[i]=0;
            }
            answer = Math.max(answer,L);
        }
    }
    
}