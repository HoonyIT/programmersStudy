import java.util.*;

class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        int idx = 0;
        //4방향(9,12,3,6) + 대각선일경우??
        //-1*x,y  | x,(n-y)*2  |  (m-x)*2,y | x,-1*y
        for(int[] x: balls){
            int min = Integer.MAX_VALUE, dis=0, nx, ny;
            //9
            if(startX>x[0] && startY!=x[1] || startX<=x[0]) { //원쿠션 가능 조건
                nx = (startX+x[0])*(startX+x[0]);
                ny = (startY-x[1])*(startY-x[1]);
                dis = nx+ny;
                min = Math.min(min,dis);
            }
            //12
            if(startY<x[1] && startX!=x[0] || startY>=x[1]) {
                nx = (startX-x[0])*(startX-x[0]);
                ny = ((n-x[1])+(n-startY))*((n-x[1])+(n-startY));
                dis = nx+ny;
                min = Math.min(min,dis);
            }
            //3
            if(startX<x[0] && startY!=x[1] || startX>=x[0]) {
                nx = ((m-x[0])+(m-startX))*((m-x[0])+(m-startX));
                ny = (startY-x[1])*(startY-x[1]);
                dis = nx+ny;
                min = Math.min(min,dis);
            }
            //6
            if(startY>x[1] && startX!=x[0] || startY<=x[1]) {
                nx = (startX-x[0])*(startX-x[0]);
                ny = (startY+x[1])*(startY+x[1]);
                dis = nx+ny;
                min = Math.min(min,dis);
            }
            answer[idx] = min;
            idx++;
        }
        
        return answer;
    }
}