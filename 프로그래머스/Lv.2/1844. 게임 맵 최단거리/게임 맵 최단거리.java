import java.util.*;

class pos{
    int x;
    int y;
    int level;
    public pos(int x, int y, int level){
        this.x = x;
        this.y = y;
        this.level = level;
    }
}

class Solution {
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    public int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;
        int[][] ch = new int[N][M];
        Queue<pos> Q = new LinkedList<>();
        
        Q.offer(new pos(0,0,1));
        ch[0][0] = 1;
        
        while(!Q.isEmpty()){
            pos tmp = Q.poll();
            int Level = tmp.level;
            
            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                
                if(nx>=0 && nx<N && ny>=0 && ny<M && ch[nx][ny]==0 && maps[nx][ny]==1){
                    //갈 수 있고, 아직 방문 안한 곳
                    if(nx==N-1 && ny==M-1) return Level+1;
                    ch[nx][ny]=1;
                    Q.offer(new pos(nx,ny,Level+1));
                }
            }
        }
        
        return -1; //여기오면 도달 못하는 것
    }
}