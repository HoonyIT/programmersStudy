import java.util.*;

class Point {
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    public ArrayList<Integer> solution(String[] maps) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Point> Q = new LinkedList<>();
        int m = maps.length;
        int n = maps[0].length();
        boolean[][] visit = new boolean[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int sum=0;
                if(!visit[i][j] && maps[i].charAt(j)!='X'){ //start
                    Q.offer(new Point(i,j));
                    visit[i][j] = true;
                    sum+=maps[i].charAt(j)-48;
                    while(!Q.isEmpty()){ //BFS
                        int len = Q.size();
                        for(int k=0; k<len; k++){
                            Point p = Q.poll();
                            for(int L=0; L<4; L++){
                                int nx = p.x+dx[L];
                                int ny = p.y+dy[L];
                                if(nx>=0 && nx<m && ny>=0 && ny<n && maps[nx].charAt(ny)!='X' && !visit[nx][ny]) {
                                    sum+=maps[nx].charAt(ny)-48;
                                    Q.offer(new Point(nx,ny));
                                    visit[nx][ny] = true;
                                }
                            }
                        }
                    } //while
                } //if
                else continue;
                answer.add(sum);
            }
        }
        
        if(answer.size()==0) answer.add(-1);
        Collections.sort(answer);
        
        return answer;
    }
}