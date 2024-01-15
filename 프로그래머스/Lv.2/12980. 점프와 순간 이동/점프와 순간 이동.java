import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        //2500 1250 625 312(1) 156 73 36(1) 18 9 4(1)
        
        while(n!=0){
            if(n%2==0) n/=2;
            else{
                ans++;
                n--;
                n/=2;
            }
        }
        
        return ans;
    }
}