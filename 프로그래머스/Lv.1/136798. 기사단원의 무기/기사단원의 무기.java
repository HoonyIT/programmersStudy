import java.util.*;



class Solution {
    public int[] divisor(int n){ //약수의 개수 구하기
        int[] answer = new int[n+1];
        
        for(int i=1; i<n+1; i++){
            for(int j=i; j<n+1; j+=i){
                answer[j]++;
            }
        }
        return answer;
    }
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] ch = divisor(number);
        
        for(int x: ch){
            if(x>limit) answer+=power;
            else answer+=x;
        }
        
        return answer;
    }
}