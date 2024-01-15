import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int date=0; 
        int sum=0;
        HashMap<String,Integer> map = new HashMap<>(); //살 것

        for(int k=0; k<want.length; k++) sum+=number[k];
        
        
        for(int i=0; i<discount.length-9; i++){
            date++;
            for(int k=0; k<want.length; k++) map.put(want[k],number[k]);

            for(int j=i; j<10+i; j++){
                String x = discount[j];
                if(map.containsKey(x)){
                    map.put(x,map.get(x)-1);
                    if(map.get(x)==0) map.remove(x);
                }
            }
            
            if(map.isEmpty()) {
                System.out.println(date);
                answer++;
            }
            if(sum>discount.length-date) break;
        }
        
        
        return answer;
    }
}