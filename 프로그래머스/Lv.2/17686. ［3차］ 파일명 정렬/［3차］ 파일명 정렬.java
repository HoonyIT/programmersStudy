import java.util.*;

class Sort implements Comparable<Sort> {
    String s;
    int n;
    int i;
    Sort(String s, int n, int i){
        this.s = s;
        this.n = n;
        this.i = i;
    }
    @Override
    public int compareTo(Sort s){
        if(this.s.equals(s.s)){
            if(this.n == s.n) return this.i-s.i;
            else return this.n-s.n;
        }
        else return this.s.compareTo(s.s);
    }
}

class Solution {
    int N;
    String[] head;
    int[] number;
    ArrayList<Sort> list = new ArrayList<>();
    
    public String[] solution(String[] files) {
        
        N = files.length;
        String[] answer = new String[N];
        head = new String[N];
        number = new int[N];
        Arrays.fill(number,-1);
        
        
        //집합
        Gather(files);
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++){
            answer[i] = files[list.get(i).i];
        }
        
        return answer;
    }
    
    public void Gather (String[] files){
        for(int i=0; i<N; i++){
            String s = files[i];
            for(int j=0; j<files[i].length(); j++){
                if(head[i]==null && Character.isDigit(s.charAt(j))){
                    head[i] = s.substring(0,j).toUpperCase();
                }
                else if(head[i]!=null && !Character.isDigit(s.charAt(j))){
                    number[i] = Integer.parseInt(s.substring(head[i].length(),j));
                    break;
                }
            }
            //TAIL이 빈 문자열일 경우
            if(number[i]==-1) number[i] = Integer.parseInt(s.substring(head[i].length()));
            
            list.add(new Sort(head[i],number[i],i));
        }
    }
    
}