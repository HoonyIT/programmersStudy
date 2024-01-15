import java.util.*;

class points implements Comparable<points>{
    String s;
    char c;
    int i;

    points(String s, char c, int i){
        this.s = s;
        this.c = c;
        this.i = i;
    }

    public int compareTo(points p){
        if(this.c == p.c) return this.s.compareTo(p.s);
        return this.c-p.c;
    }
}

class Solution{
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<points> list = new ArrayList<>();
        
        for(int i=0; i<strings.length; i++){
            list.add(new points(strings[i],strings[i].charAt(n),i));
        }
        
        Collections.sort(list);
        
        for(int i=0; i<answer.length; i++){
            answer[i] = strings[list.get(i).i];
        }
        
        return answer;
    }
    
}
