import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int minIndex=0 ;
        for(int i=0; i<arr.length; i++){
            if(arr[minIndex]>arr[i]) minIndex = i;
        }
        
        for(int i=0; i<arr.length; i++){
            if(i!=minIndex) list.add(arr[i]);
        }
        
        if(list.size()==0) list.add(-1);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}