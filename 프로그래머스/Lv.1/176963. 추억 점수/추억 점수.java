import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer> map = new HashMap<>();
        int[] answer = new int[photo.length];
        
        for(int i=0; i<name.length; i++){
            map.put(name[i],yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            int tmp = 0;
            for(String x: photo[i]){
                if(map.containsKey(x)) tmp += map.get(x).intValue();
            }
            answer[i] = tmp;
        }
        
        
        return answer;
    }
}