import java.util.*;

class Id {
    String InOut;
    String id;
    public Id(String InOut, String id){
        this.InOut = InOut;
        this.id = id;
    }
}

class Solution {
    public String[] solution(String[] record) {
        HashMap<String,String> map = new HashMap<>();
        ArrayList<Id> list = new ArrayList<>();
        
        for(String s: record){
            String[] tmpS = s.split(" ");
            
            if(tmpS[0].equals("Enter") || tmpS[0].equals("Leave")) list.add(new Id(tmpS[0],tmpS[1]));
            if(tmpS[0].equals("Enter") || tmpS[0].equals("Change")) map.put(tmpS[1],tmpS[2]);
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i).InOut.equals("Enter")){
                answer[i] = map.get(list.get(i).id) + "님이 들어왔습니다.";
            }
            else if(list.get(i).InOut.equals("Leave")){
                answer[i] = map.get(list.get(i).id) + "님이 나갔습니다.";
            }
            else continue;
        }
        
        return answer;
    }
}