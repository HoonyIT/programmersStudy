import java.util.*;
class tang implements Comparable<tang>{
    int tang, sum;
    public tang(int t, int s){
        this.tang = t;
        this.sum = s;
    }
    @Override
    public int compareTo(tang t){
        return t.sum - this.sum;
    }
}
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<tang> list = new ArrayList<>();
        
        for(int x: tangerine) map.put(x,map.getOrDefault(x,0)+1);
        
        for(int m: map.keySet()) list.add(new tang(m,map.get(m)));
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++){
            answer++;
            k-=list.get(i).sum;
            if(k<=0) break;
        }
        return answer;
    }
}