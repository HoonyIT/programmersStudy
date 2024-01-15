import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE,luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE,rdy = Integer.MIN_VALUE;
        for(int i=0; i<wallpaper.length; i++){
            char[] c = wallpaper[i].toCharArray();
            for(int j=0; j<c.length; j++){
                if(c[j]=='#'){
                    lux = Math.min(lux,i);
                    rdx = Math.max(rdx,i);
                    luy = Math.min(luy,j);
                    rdy = Math.max(rdy,j);
                }
            }
        }
        int[] answer = {lux,luy,rdx+1,rdy+1};
        return answer;
    }
}  