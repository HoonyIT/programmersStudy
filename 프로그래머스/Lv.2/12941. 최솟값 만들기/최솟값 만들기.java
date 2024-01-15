import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int n=B.length-1;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int x: A){
            answer+= x*B[n];
            n--;
        }

        return answer;
    }
}