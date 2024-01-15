import java.util.*;

class Solution {
    String[] s = {"A","E","I","O","U"};
    int answer=0, count=0;
    
    public void DFS(int L, String tmp, String word){
        if(tmp.equals(word)){
          answer = count;
          return ;
        } 
        else if(L>=5) return;
        else{
            for(int i=0; i<5; i++){
                count++;
                // System.out.println(tmp+s[i]);
                DFS(L+1, tmp+s[i],word);
                if(answer!=0) return;
            }
        }
    }
    
    public int solution(String word) {
        
        DFS(0,"", word);
        
        return answer;
    }
}