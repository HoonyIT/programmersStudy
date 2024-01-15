import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        
        
        for(String x: babbling){
            if(x.equals("aya")||x.equals("ye")||
               x.equals("woo")||x.equals("ma")) answer++;
            else{
                map.put("aya",0);
                map.put("ye",0);
                map.put("woo",0);
                map.put("ma",0);
                
                StringBuilder tmp = new StringBuilder();
                int size = 0;
                String s1="";
                
                for(char y: x.toCharArray()){
                    tmp.append(y);
                    if(map.containsKey(tmp.toString())){
                        if(s1.equals(tmp.toString())) break; //연속으로 나올 때
                         else{
                             size+=tmp.length();
                             s1=tmp.toString();
                             map.put(tmp.toString(),map.get(tmp.toString())+1);
                             tmp.delete(0,tmp.length());
                         }
                    }
                }
                if(size==x.length()) answer++;
            }
        }
        
        return answer;

    }
}