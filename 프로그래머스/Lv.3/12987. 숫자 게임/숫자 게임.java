import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        Deque<Integer> Q = new ArrayDeque<>();
        
        for(int b: B) Q.offer(b); //Last(big) , First(small)
        
        for(int i=A.length-1; i>=0; i--){
            if(A[i]>=Q.peekLast()) Q.pollFirst();
            else{
                Q.pollLast();
                answer++;
            }
        }
        
        return answer;
    }
}