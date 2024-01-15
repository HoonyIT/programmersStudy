import java.util.*;

class time implements Comparable<time>{
    String Con;
    int ST, RT;
    public time(String[] s){
        this.Con = s[0];
        String[] ss = s[1].split(":");
        this.ST = Integer.parseInt(ss[0]) * 60 + Integer.parseInt(ss[1]);
        this.RT = Integer.parseInt(s[2]);
    }
    @Override
    public int compareTo(time t){
        return this.ST-t.ST;
    }
}
class Solution {
    public ArrayList<String> solution(String[][] plans) {
        ArrayList<String> answer = new ArrayList<>();
        Stack<time> st = new Stack<>();
        ArrayList<time> list = new ArrayList<>();
        int currTime = 0;

        for(int i=0; i<plans.length; i++){
            list.add(new time(plans[i]));
        }
        Collections.sort(list);
        
        st.push(list.get(0));
        currTime = list.get(0).ST;
        
        for(int i=1; i<list.size(); i++){
            while(!st.isEmpty()){
                if(list.get(i).ST >= currTime + st.peek().RT){
                    //새 작업 전 완료 가능
                    currTime += st.peek().RT;
                    answer.add(st.pop().Con);
                }
                else{
                    //진행 중 새작업 도착
                    st.peek().RT -= list.get(i).ST - currTime;
                    break;
                }
            }
            currTime = list.get(i).ST;
            st.push(list.get(i));
        }
        
         while(!st.isEmpty()){
             answer.add(st.pop().Con);
         }
        
        
        return answer;
    }
}