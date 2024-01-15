import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(String x: keymap){
            char[] c = x.toCharArray();
            for(int i=0; i<c.length; i++){
                map.put(c[i],Math.min(i+1,map.getOrDefault(c[i],i+1)));
            }
        }
        
        for(int i=0; i<targets.length; i++){
            int cnt = 0;
            for(char c: targets[i].toCharArray()){
                if(!map.containsKey(c)){
                    cnt=-1;
                    break;
                }
                cnt += map.get(c);
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}