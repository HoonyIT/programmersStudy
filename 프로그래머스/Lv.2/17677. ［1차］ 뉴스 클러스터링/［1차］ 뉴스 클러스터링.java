import java.util.*;

class Solution {
    
    public double Jac (ArrayList<String> list1, ArrayList<String> list2){
        int intersect=0, Union=0;
        int N = Math.min(list1.size(),list2.size());
        
        for(String s: list1){
            if(list2.contains(s)){
                intersect++;
                Union++;
                for(int i=0; i<list2.size(); i++){
                    if(list2.get(i).equals(s)) {list2.remove(i); break;}
                }
            }
            else Union++;
        }
        
        if(list2.size()!=0) Union+=list2.size();

        return (double)intersect/Union;
    }
    
    public ArrayList<String> Gather(String st, ArrayList<String> list){
        char[] c = st.toCharArray();
        for(int i=0; i<c.length-1; i++){
            if(!Character.isAlphabetic(c[i]) || !Character.isAlphabetic(c[i+1])) continue;
            else list.add(""+Character.toUpperCase(c[i])+Character.toUpperCase(c[i+1]));
        }
        return list;
    }
    
    public int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        //다중집합 생성
        Gather(str1,list1);
        Gather(str2,list2);
        
        if(list1.size()==0 && list2.size()==0) return 65536;
        else if(list1.size()==0 || list2.size()==0) return 0; // ?
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        double jac = Jac(list1,list2);
        
        answer = (int)Math.floor(65536*jac);
        
        return answer;
    }
}