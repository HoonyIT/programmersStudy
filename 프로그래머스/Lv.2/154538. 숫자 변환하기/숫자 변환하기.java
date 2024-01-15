import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        if(x==y) return 0;
        
        Queue<Integer> Q = new LinkedList<>();
        Set<Integer> ch = new HashSet<>();
        
        Q.offer(x);
        int L=0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                int tmp = Q.poll();
                for(int j=0; j<3; j++){
                    int tmpN;
                    if(j==0) tmpN=tmp+n;
                    else if(j==1) tmpN= tmp*2;
                    else tmpN=tmp*3;
                    
                    if(tmpN==y) return L+1;
                    else{
                        if(!ch.contains(tmpN) && tmpN<y) {
                            Q.offer(tmpN);
                            ch.add(tmpN);
                        }
                    }
                }
            }
            L++;
        }
        
        answer = -1;
        
        return answer;
    }
}