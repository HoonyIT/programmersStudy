import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a=n;
        int b=m;
        int tmp;
        //유클리드 호제법 : G(a,b) > a에서 b를 나눴을 때 나머지가 r이면 a,b의 최대 공약수 = b,r의 최대공약수 G(180, 200) = G(180, 200 - 180) = G(180, 20) = G(180 - 20 × 8, 20) = G(20, 20) = 20
        
        //최대공약수 * 최소공배수 = A*B
        
        while(a!=b){
            tmp=Math.min(a,b);
            a=Math.max(a,b)-tmp;
            b=tmp;
        }
        answer[0] = a;
        answer[1] = n*m/a;
        
        
        // public static int gcd(int p, int q)
           // {
            // if (q == 0) return p;
            // return gcd(q, p%q); //최대공약수 구하기
           // }
        
        return answer;
    }
}