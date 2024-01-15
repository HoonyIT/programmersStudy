import java.util.*;

class Solution {
    public long solution(int w, int h) {
        long answer = (long)w*h;
        
        //세로가 더 크게
        int W = Math.min(w,h);
        int H = Math.max(w,h);
        
        int GCD = gcd(W,H);
        
        //작은 타일
        int WW = W/GCD;
        int HH = H/GCD;
            
        //작은 타일 흰색 부분
        long white = (long)WW*HH - (long)(WW-1)*(HH-1); // WW+HH-1 == W+H-GCD
            
        answer -= white*GCD;
        
        
        return answer;
    }
    
    public int gcd(int w, int h) {
        while(w!=0){
            int z = h%w;
            h=w;
            w=z;
        }
        return h;
    }
}