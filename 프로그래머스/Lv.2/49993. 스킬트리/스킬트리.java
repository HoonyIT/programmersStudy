import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String s: skill_trees){
            int[] check = new int[skill.length()];
            int i=0;
            
            Loop1: for(char c: s.toCharArray()){
                        int tmp = skill.indexOf(c);
                        if(tmp!=-1){ //선행스킬확인
                            for(; i<tmp; i++){ 
                                if(check[i]==0) {
                                    i=-1;
                                    break Loop1;
                                }
                            }
                            check[tmp]=1;
                        }
                    }
            
            if(i!=-1) answer++;
        }
        
        return answer;
    }
}