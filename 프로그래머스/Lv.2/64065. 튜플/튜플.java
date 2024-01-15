import java.util.*;

class Size implements Comparable<Size>{
    int n,size;
    public Size(int n, int size){
        this.n = n;
        this.size = size;
    }
    @Override
    public int compareTo(Size s){
        return s.size-this.size;
    }
}

class Solution {
    public int[] solution(String s) {
        int[] ck = new int [100001];
        ArrayList<Size> list = new ArrayList<>();
        
        String[] tmp = s.replaceAll("[^,0-9]","").split(",");
        
        for(String ss: tmp){
            int t = Integer.parseInt(ss);
            ck[t]++;
        }
        
        for(int i=1; i<100001; i++){
            if(ck[i]!=0) list.add(new Size(i,ck[i]));
        }
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i).n;
        }
        
        
        return answer;
    }
}