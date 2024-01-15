import java.util.*;

class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    int n,m;
    boolean[][] visit;
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    public int solution(String[] board) {
        int answer = 0;
        Queue<Point> Q = new LinkedList<>();
        n = board.length;
        m = board[0].length();
        visit = new boolean[n][m];
            
        
        for(int i=0;i<n; i++){
            int j = board[i].indexOf("R");
            if(j >= 0){
                Q.offer(new Point(i,j)); //시작점 찾기
                visit[i][j] = true;
                break;
            }
        }
        
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                Point tmp = Q.poll();
                
                for(int j=0; j<4; j++){
                    int nx = tmp.x+dx[j];
                    int ny = tmp.y+dy[j];
                    
                    while(true){
                        if(nx < 0 || ny < 0 || nx >= n || ny >= m || board[nx].charAt(ny) == 'D') break;
                        nx += dx[j];
                        ny += dy[j];
                    }
                    
                    if(board[nx-dx[j]].charAt(ny-dy[j])=='G') return answer+1;
                    if(!visit[nx-dx[j]][ny-dy[j]]) {
                        visit[nx-dx[j]][ny-dy[j]] = true;
                        Q.offer(new Point(nx-dx[j],ny-dy[j]));
                    }
                }
            }
            answer++;
        }
        //G로 못가는 경우
        answer = -1;
        
        return answer;
    }
}