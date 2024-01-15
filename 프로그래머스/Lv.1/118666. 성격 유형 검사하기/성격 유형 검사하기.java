import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        String[] mbti = {"RT","CF","JM","AN"};
        
        for(int i=0; i<survey.length; i++){
            String s1 = survey[i].substring(0,1);
            String s2 = survey[i].substring(1);
            if(choices[i]!=4){
                switch(choices[i]){
                    case 1: map.put(s1,map.getOrDefault(s1,0)+3); break;
                    case 2: map.put(s1,map.getOrDefault(s1,0)+2); break;
                    case 3: map.put(s1,map.getOrDefault(s1,0)+1); break;
                    case 5: map.put(s2,map.getOrDefault(s2,0)+1); break;
                    case 6: map.put(s2,map.getOrDefault(s2,0)+2); break;
                    case 7: map.put(s2,map.getOrDefault(s2,0)+3); break;
                }
            }
        }
        
        for(int j=0; j<4; j++){
            String m1 = mbti[j].substring(0,1);
            String m2 = mbti[j].substring(1);
            if(map.getOrDefault(m1,0) >= map.getOrDefault(m2,0)) answer+=m1;
            else answer+=m2;
        }
        
        return answer;
    }
}