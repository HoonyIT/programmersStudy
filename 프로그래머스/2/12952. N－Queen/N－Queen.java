class Solution {
    int answer;
    int[] board;
    public int solution(int n) {
        answer = 0;
        board = new int[n]; // board[0] First Row queen's col index
        NQueen(0,n);
        return answer;
    }
    
    public void NQueen(int depth, int n){
        if(depth==n){
            answer++;
            return;
        }
        for(int i=0; i<n; i++){
            board[depth] = i;
            if(vaild(depth)) NQueen(depth+1,n);
        }
    }
    
    public boolean vaild(int depth){
        for(int j=0; j<depth; j++){
            if(board[depth]==board[j]) return false; //col check
            if(Math.abs(depth-j)==Math.abs(board[depth]-board[j])) return false; //diag check
        }
        return true;
    }
}