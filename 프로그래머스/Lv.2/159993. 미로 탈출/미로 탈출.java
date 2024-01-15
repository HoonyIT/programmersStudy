import java.util.*;

class Vex {
    int row;
    int col;
    Vex(int r, int c){
        this.row = r;
        this.col = c;
    }
}

class Solution {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public int solution(String[] maps) {
        int answer = -1;
        Queue<Vex> Q = new LinkedList<>();
        int n = maps.length; //row
        int m = maps[0].length(); //col
        boolean[][] visit = new boolean[n][m];
        
        for(int i=0; i<maps.length; i++){
            if(maps[i].indexOf("S")>=0) {
                Q.offer(new Vex(i,maps[i].indexOf("S")));
                visit[i][maps[i].indexOf("S")] = true;
                break;
            }
        }
        
        int L=0;
        boolean Quest = false;
        while(!Q.isEmpty()){
            int len = Q.size();
            Loop1: 
            for(int j=0; j<len; j++){
                Vex v = Q.poll();
                int nowRow = v.row;
                int nowCol = v.col;
                for(int i=0; i<4; i++){
                    int nx = nowRow + dx[i];
                    int ny = nowCol + dy[i];
                    if(nx>=0 && nx<n && ny>=0 && ny<m && !visit[nx][ny]){
                        if(maps[nx].charAt(ny)=='L') {
                            Quest = true;
                            for(boolean[] b: visit) Arrays.fill(b,false); //방문초기화
                            Q.clear(); //Q초기화 (L~E까지 최소 시간)
                            Q.offer(new Vex(nx,ny));
                            visit[nx][ny] = true;
                            break Loop1;
                        }
                        if(Quest && maps[nx].charAt(ny)=='E') return L+1;

                        if(maps[nx].charAt(ny)!='X') {
                            Q.offer(new Vex(nx,ny));
                            visit[nx][ny] = true;
                        }
                    }
                }
            }
            L++;
        }
        
        return answer;
    }
}