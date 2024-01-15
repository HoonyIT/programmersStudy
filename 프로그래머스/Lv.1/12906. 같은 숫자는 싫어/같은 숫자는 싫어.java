import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int temp = arr[0] ;
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(temp != arr[i]){
                temp = arr[i];
                list.add(temp);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i).intValue();
        }
        
        return answer;
    }
}