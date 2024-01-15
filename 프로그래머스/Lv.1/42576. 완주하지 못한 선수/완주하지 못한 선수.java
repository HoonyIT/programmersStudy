import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String x : participant){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        for(String y : completion){
            map.put(y,map.get(y)-1);
            if(map.get(y)==0) map.remove(y);  
        }
        for(String key : map.keySet()) answer+=key;

        return answer;
    }
}