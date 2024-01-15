import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<String> Q = new LinkedList<>();
        boolean[] visit = new boolean[words.length];
        
        int L = 0;
        Q.offer(begin);
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                String tmp = Q.poll();
                char[] tmpC = tmp.toCharArray();
                for(int j=0; j<words.length; j++){
                    char[] tmpW = words[j].toCharArray();
                    int cnt = 0;
                    for(int k=0; k<tmpW.length; k++){
                        if(tmpC[k]!=tmpW[k]) cnt++;
                        if(cnt>1) break;
                    }
                    if(!visit[j] && cnt==1){ //변환가능
                        if(words[j].equals(target)) return L+1;
                        Q.offer(words[j]);
                        visit[j] = true;
                    }
                }
            }
            L++;
        }
        
        return answer;
    }
}