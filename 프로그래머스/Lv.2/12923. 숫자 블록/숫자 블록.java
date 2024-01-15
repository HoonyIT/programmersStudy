import java.util.*;

class Solution {
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int)end-(int)begin+1]; //최대 5001
        //10,000,000

        for(int i=answer.length-1; i>=0; i--){
            int N=2;
            while(true){
                int tmp = (int)end/N;
                
                if(end%N==0){
                    if(tmp<=10000000){answer[i]=(int)end/N;break;}
                    if(tmp>10000000 && isPrime(tmp)){answer[i]=N;break;}
                }
                else if(tmp<N) {answer[i]=1;break;}
                N++;
            }
            end--;
        }
        
        if(begin==1) answer[0]=0;

        
        return answer;
    }
    
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
}
}