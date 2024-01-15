import java.util.*;

class Solution {
    int answer=0;
    HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        /*
        1. 만들 수 있는 숫자의 size별 DFS
        2. 소수인지 check
        3. set으로 같은 숫자 중복 제외
        */
        boolean[] visit = new boolean[numbers.length()];
        
        for(int i=1; i<=numbers.length(); i++){ //숫자 개수
            DFS(0,numbers,"", visit, i);
        }
        
        
        return answer;
    }
    
    public void DFS(int L, String numbers, String tmp, boolean[] visit, int end){
        if(L==end){
            int num = Integer.parseInt(tmp);
            if(!set.add(num)) return;
            if(isPrime(num)) answer++;
            // System.out.println(tmp);
            return;
        }
        else{
            for(int i=0; i<numbers.length(); i++){
                if(!visit[i]) {
                    visit[i] = true;
                    DFS(L+1, numbers, tmp+numbers.charAt(i), visit, end);
                    visit[i] = false;
                }
            }
        }
    }
    
    public boolean isPrime(int n){
        if(n==1 || n==0) return false;
        for(int i=2; i<n/2+1; i++){
            if(n%i==0) return false;
        }
        return true;
    }

}