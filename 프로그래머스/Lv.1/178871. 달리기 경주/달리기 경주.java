import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> map = new HashMap<>();
        int i=0;
        
        for(String p: players) {
            map.put(p,i++);
        }
        
        for(String c: callings){ //1등은 안불리므로 0걱정 x
            int tmp = map.get(c);
            map.put(players[tmp-1],map.get(players[tmp-1])+1);
            map.put(players[tmp],map.get(players[tmp])-1);

            String tmpS = players[tmp];
            players[tmp]=players[tmp-1];
            players[tmp-1]=tmpS;
        }
        
        return players;
    }
}