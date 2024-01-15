import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long low = 1;
        long high = (long)n*times[times.length-1];
        long mid=0;
        while(low<=high){
            mid = (low+high)/2;
            long tmp = 0;
            for(int x: times){
                tmp += mid/(long)x;
            }
            if(tmp>=n){
                high = mid-1;
            }
            else low = mid +1;
            
            System.out.print("hi : " + high+" ");
            System.out.print("mid : " + mid+" ");
            System.out.print("lo : " + low);
            System.out.println();
        }
        answer = low;
        
        return answer;
        
        
    }
}