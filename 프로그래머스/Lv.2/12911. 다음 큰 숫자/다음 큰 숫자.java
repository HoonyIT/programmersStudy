import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int nBC = Integer.bitCount(n); //n을 이진수로 바꾼 뒤 1의 개수
        
        for (int i=n+1; i<10000000; i++){
            int TBC = Integer.bitCount(i);
            if(nBC ==TBC) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}