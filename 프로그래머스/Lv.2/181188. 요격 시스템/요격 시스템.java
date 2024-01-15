import java.util.*;

class Point implements Comparable<Point>{
    int s;
    int e;
    public Point(int s, int e){
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Point p){
        return this.e-p.e;
    }
}

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        PriorityQueue<Point> Q = new PriorityQueue<>();
        
        for(int[] x: targets) Q.offer(new Point(x[0],x[1]));
        
        while(!Q.isEmpty()){
            Point tmp = Q.poll();
            int end = tmp.e;
            
            while(true){
                if(!Q.isEmpty() && Q.peek().s<end) Q.poll();
                else break;
            }
            answer++;
        }
        
        return answer;
    }
}