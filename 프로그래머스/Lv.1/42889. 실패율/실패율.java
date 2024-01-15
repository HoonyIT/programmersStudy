import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer,Double> hm = new HashMap<Integer,Double>();

        Arrays.sort(stages);
        int person=stages.length;
        
        for(int x: stages){
            if(x>N) break;
            hm.put(x,hm.getOrDefault(x,0.0)+1);
        }
        
        for(int i=1; i<=N; i++){
            double tmp=hm.getOrDefault(i,0.0);
            if(person==0) person=1;
            tmp/=person;
            person-=hm.getOrDefault(i,0.0);
            hm.put(i,tmp);
        }
        
        /*HashMap을 value값 기준 비교*/
        ArrayList<Integer> list = new ArrayList<>(hm.keySet());
        Collections.sort(list,(h1, h2) -> hm.get(h2).compareTo(hm.get(h1))); //내림차순
        
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}