import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<>();
        char[] cx = X.toCharArray();
        char[] cy = Y.toCharArray();
        
        Arrays.sort(cx);
        Arrays.sort(cy);
        
        
        
        // System.out.println(Arrays.toString(cx));
        // System.out.println(Arrays.toString(cy));
        
        int ix=0, iy=0;
        
        while(ix<cx.length && iy<cy.length){
            if(cx[ix]==cy[iy]) {
                list.add(cx[ix]-48);
                ix++;
                iy++;
            }
            else if(cx[ix]<cy[iy]) ix++;
            else iy++;
        }
        
        if(list.size()==0) return "-1";
        else{
            Collections.sort(list, Collections.reverseOrder());
        }
        
        if(list.get(0)==0) return "0";
        // System.out.println(list);
        
        StringBuilder s = new StringBuilder(); //중요!
        for(int i=0; i<list.size(); i++){
            s.append(list.get(i));
        }
        
        answer=s.toString();
        
        return answer;
    }
}