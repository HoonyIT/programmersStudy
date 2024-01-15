import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String[] cache = new String[cacheSize];
        Arrays.fill(cache,"");

        for(String s: cities){
            int idx = -1;
            
            //hit
            for(int i=0; i<cacheSize; i++) if(s.toUpperCase().equals(cache[i].toUpperCase())) idx=i;
            
            //count
            if(idx==-1){ //miss
                for(int j=cacheSize-1; j>0; j--){
                    cache[j] = cache[j-1]; 
                }
                answer+=5;
            }
            else{ //hit
                for(int j=idx; j>0; j--){
                    cache[j] = cache[j-1];
                }
                answer++;
            }
            if(cacheSize!=0) cache[0]=s;
            
            // System.out.println(Arrays.toString(cache) + " / " + idx + " / " +answer);
        }
        
        
        return answer;
    }
}