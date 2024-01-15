import java.util.*;

class Seq implements Comparable<Seq> {
    int s;
    int amt;
    public Seq(int s, int a){
        this.s = s;
        this.amt = a;
    }
    @Override
    public int compareTo(Seq S){
        return this.s-S.s;
    }
}

class Solution {
    String[][] record;
    public int[] solution(int[] fees, String[] records) {
        ArrayList<Seq> list = new ArrayList<>();
        HashMap<String,Integer> InOut = new HashMap<>(); //IN,OUT
        HashMap<String,Integer> map = new HashMap<>(); //누적
        int last = 23*60+59;
        
        record = new String[records.length][3];
        
        for(int i=0; i<records.length; i++){
            String[] tmp = records[i].split(" ");
            String[] time = tmp[0].split(":");
            record[i][0] = String.valueOf(Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]));
            record[i][1] = tmp[1];
            record[i][2] = tmp[2];
        }
        
        // 0:시간, 1:차량, 2:InOut
        for(int i=0; i<record.length; i++){
            if(record[i][2].equals("IN")) InOut.put(record[i][1],Integer.parseInt(record[i][0]));
            else{
                map.put(record[i][1],map.getOrDefault(record[i][1],0)
                                      + Integer.parseInt(record[i][0])-InOut.get(record[i][1]));
                InOut.remove(record[i][1]);
            }
        }
        
        //출차기록 없을 경우
        if(!InOut.isEmpty()){
            for(String s: InOut.keySet()){
                map.put(s,map.getOrDefault(s,0)+last-InOut.get(s));
                // InOut.remove(s); 1,3~12 런타임에러
            }
        }


        for(String s: map.keySet()){
            if(map.get(s)<=fees[0]) list.add(new Seq(Integer.parseInt(s),fees[1]));
            else{
                list.add(new Seq(Integer.parseInt(s),
                                fees[1] + (int)Math.ceil(((map.get(s)-fees[0])/(fees[2]*1.0)))*fees[3]
                                ));
            }
        }
        
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).amt;
        }
        return answer;
    }
}