import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        
        for(String x : map.keySet()){
            answer *= (map.get(x)+1);
        }
        answer--;
        
        //개수 (2,1,4), 뽑기 m > (2+1)*(1+1)*(4+1)-1(아무것도 입지 않을 경우) 
        return answer;
    }
}