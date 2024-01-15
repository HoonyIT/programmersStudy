import java.util.*;

class Solution {
    public String solution(String number, int k) {
        /*Greedy (해당 시점에 최적 선택)
          0~k까지 중 가장 큰수 선택 , I  k-=I
          0~I까지 자르기
          다시 0~남은 K까지 중 가장 큰수 선택
          ...
        */
        
        StringBuilder sb = new StringBuilder();
        StringBuilder num = new StringBuilder(number);
        int K = k;
        
        while(sb.length() != number.length()-k){
            int MAX = Integer.MIN_VALUE;
            int i=0;
            for(; i<=K; i++){
                MAX = Math.max(MAX,num.charAt(i)-48);
            }
            sb.append(MAX);
            i = num.indexOf(String.valueOf(MAX));
            K -= i;
            num.delete(0,i+1);
        }
        
        return sb.toString();
    }
}