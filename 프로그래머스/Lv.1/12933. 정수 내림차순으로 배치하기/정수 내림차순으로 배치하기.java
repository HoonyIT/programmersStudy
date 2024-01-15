import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<>();
        
        for(long i=n; i>0; i/=10){
            list.add(i%10);
        }
        Collections.sort(list,Collections.reverseOrder());

        String tmp = "";
        for(long x: list){tmp+=x;}
        
        answer = Long.parseLong(tmp);
        return answer;
    }
}