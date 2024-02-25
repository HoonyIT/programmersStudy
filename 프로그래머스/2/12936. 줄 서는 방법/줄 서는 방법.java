import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++)  list.add(i);
        int N = list.size();
        
        long pac = 1L;
        for(int i=2; i<=n; i++) pac*=i;
        
        for(int i=0; i<n; i++){
            long numArea = pac/N;
            int proportion = (int) (k/numArea);
            int remainder  = (int) (k%numArea);
            
            if(remainder==0){
                answer[i] = list.get(proportion-1);
                list.remove(proportion-1);
                k=numArea;
            }
            else{
                answer[i] = list.get(proportion);
                list.remove(proportion);
                k%=numArea;
            }
            pac/=N;
            N--;
        }
        
        return answer;
    }
}


/*시간초과
class Solution {
    boolean[] visit;
    int N;
    long cnt=0;
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        visit = new boolean[n];
        N=n;
        
        DFS(k, answer, 0);
        
        return answer;
    }
    
    public void DFS(long k, int[] answer, int L){
        
        if(L==N){
            cnt++;
            return;
        }
        else{
            for(int i=0; i<N; i++){
                if(!visit[i]){
                    visit[i]=true;
                    answer[L] = i+1;
                    DFS(k, answer, L+1);
                    visit[i]=false;
                }
                if(cnt==k)break;
            }
        }
    }
}
*/