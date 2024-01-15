import java.util.*;

class Point {
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Vector {
    Point sp;
    Point ep;
    Vector(Point p1, Point p2){
        this.sp = p1;
        this.ep = p2;
        // this.sp.x = p1.x;
        // this.sp.y = p1.y;
        // this.ep.x = p2.x;
        // this.ep.y = p2.y;
    }
    @Override
    public int hashCode(){
        return Objects.hash(sp.x,sp.y,ep.x,ep.y);
    }

    @Override
    public boolean equals(Object obj){
        if(obj!=null && obj instanceof Vector){
            Vector v = (Vector) obj;
            return this.sp.x == v.sp.x && this.sp.y == v.sp.y;
        }
        return false;
    }
}

class Solution {
    public int solution(String dirs) {
        int answer=0, x=0, y=0;
        HashSet<Vector> set = new HashSet<>();

        for(char c: dirs.toCharArray()){
            int nx,ny;
            if(c=='U'){
                nx = x;
                ny = y+1;
            }
            else if(c=='D'){
                nx = x;
                ny = y-1;
            }
            else if(c=='R'){
                nx = x+1;
                ny = y;
            }
            else{
                nx = x-1;
                ny = y;
            }
            if(nx<-5 || nx>5 || ny<-5 || ny>5) continue;
            
            Point p1 = new Point(x,y);      /*출발*/
            Point p2 = new Point(nx,ny);    /*도착*/
            
            if(nx>=-5 && nx<=5 && ny>=-5 && ny<=5){
                if(set.add(new Vector(p1,p2))){ //처음 걸어봄
                    answer++;
                }
                set.add(new Vector(p2,p1));
            }
            x=nx;
            y=ny;
        }
        
        return answer;
    }
}