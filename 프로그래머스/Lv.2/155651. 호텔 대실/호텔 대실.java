import java.util.*;
class Time implements Comparable<Time>{
    int st;
    int end;
    public Time(String s, String e){
        String[] s1 = s.split(":");
        this.st = Integer.parseInt(s1[0])*60 + Integer.parseInt(s1[1]);
        String[] e1 = e.split(":");
        this.end = Integer.parseInt(e1[0])*60 + Integer.parseInt(e1[1]);
    }
    @Override
    public int compareTo(Time T){
        if(this.st==T.st) return this.end-T.end;
        else return this.st-T.st;
    }
}
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        ArrayList<Time> TList = new ArrayList<>();
        Queue<Time> RQ = new LinkedList<>();
        
        for(String[] x: book_time){
            TList.add(new Time(x[0],x[1]));
        }
        Collections.sort(TList);
        
        for(int j=0; j<TList.size(); j++){
            Time TT = TList.get(j);
            for(int i=0; i<RQ.size(); i++){
                Time RT = RQ.poll();
                if(TT.st>=RT.end+10) break; //그 방 쓰면됨
                else RQ.offer(RT); //그 방 못씀
            }
            RQ.offer(TT);
            answer = Math.max(answer,RQ.size());
        }
        
        
        return answer;
    }
}