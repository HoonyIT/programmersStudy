import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        
        int TY = Integer.parseInt(today.substring(0,4));
        int TM = Integer.parseInt(today.substring(5,7));
        int TD = Integer.parseInt(today.substring(8));
        
        
        for(String x: terms){
            String[] tmp = x.split(" ");
            map.put(tmp[0],Integer.parseInt(tmp[1]));
        }
        System.out.println(map);
        
        for(int i=0; i<privacies.length; i++){
            String[] tmp = privacies[i].split(" ");
            int Y = Integer.parseInt(tmp[0].substring(0,4));
            int M = Integer.parseInt(tmp[0].substring(5,7));
            int D = Integer.parseInt(tmp[0].substring(8));
            int mon = map.get(tmp[1]);
            
            //최대 유효 날짜
            if(M+mon>12){
                Y+= (M+mon)/12;
                M= (M+mon)%12;
                if(M==0){
                    M=12;
                    Y--;
                }
            }
            else{
                M+=mon;
            }
            
            if(D==1) {
                D=28; //07.01 ~> 06.28
                M--;
            }
            else D--;
            
            //오늘과 비교
            if(TY>Y) answer.add(i+1);
            else if(TY==Y) {
                if(TM>M) answer.add(i+1);
                else if(TM==M){
                    if(TD>D) answer.add(i+1);
                }
            }
            
        }
        
        return answer;
    }
}