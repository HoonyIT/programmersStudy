import java.util.*;

class Solution {
    public int solution(int[] topping) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;
        
        for(int x: topping) map.put(x,map.getOrDefault(x,0)+1);

        
        for(int i=0; i<topping.length-2; i++){
            int top = topping[i];
            set.add(top);
            map.put(top,map.get(top)-1);
            if(map.get(top)==0) map.remove(top);
            if(map.size()==set.size()) answer++;
        }    
        
        
        return answer;
    }    
}