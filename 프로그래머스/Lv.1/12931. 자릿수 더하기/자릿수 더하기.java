import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int numA = n;
        for(int i=1; i<=9; i++){
            if(numA/10 >= 1){
                answer += numA%(10);
                numA /= 10;
            }
        }
        answer += numA;

        return answer;
    }
}