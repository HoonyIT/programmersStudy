import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[arr.length-1];
        
        while(true){
            int i=0;
            for(; i<arr.length; i++){
                if(answer%arr[i]!=0) break;
            }
            if(i==arr.length) break;
            answer++;
        }
        
        
        return answer;
    }
}