import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int col: moves){
            for(int j=0; j<board[0].length; j++){
                if(board[j][col-1]!=0){
                    int tmp = board[j][col-1];
                    board[j][col-1]=0;
                    if(!st.isEmpty() && st.peek()==tmp){
                        st.pop();
                        answer+=2;
                    }
                    else st.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }
}