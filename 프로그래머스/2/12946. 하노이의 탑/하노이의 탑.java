import java.util.*;

class Solution {
    ArrayList<int[]>answer;
    public ArrayList<int[]> solution(int n) {
        answer = new ArrayList<>();
        
        hanoi(n,1,2,3);
        
        return answer;
    }
    
    public void hanoi(int N , int start, int mid, int to){
        if(N==1){
            answer.add(new int[]{start,to});
            return;    
        }
        
        hanoi(N-1,start,to,mid);
        answer.add(new int[]{start,to});
        hanoi(N-1,mid,start,to);
        
    }
}