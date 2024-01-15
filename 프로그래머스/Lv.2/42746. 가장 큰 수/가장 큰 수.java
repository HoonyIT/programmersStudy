import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] s = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) s[i]=String.valueOf(numbers[i]);
        
        //중요!
        Arrays.sort(s,new Comparator<String>(){
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        for(String S1: s)
            answer += S1;
            
        // 가장 큰 수가 0일 경우엔 배열 값이 모두 0이라는 말이기에 0000..이 되는 걸 방지 
        if(s[0].equals("0"))
            answer = "0";
        
        
        return answer;
    }
}