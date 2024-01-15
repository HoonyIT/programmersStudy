import java.util.*;

class Solution {
    public String solution(String s) {
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];

        for(int i=0; i< arr.length; i++){
            arr[i] = Integer.parseInt(s1[i]);
        }
        
        Arrays.sort(arr);
        String answer = "";
        answer += arr[0];
        answer += " ";
        answer += arr[arr.length-1];
        return answer;
    }
}