class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder New = new StringBuilder();
            
        //k진수 바꾸기
        while(n>0){
            New.insert(0,n%k);
            n/=k;
        }

        //소수 찾기
        String tmp = "";
        for(int i=0; i<New.length(); i++){
            if(New.charAt(i)=='0'){
                if(tmp.length()==0) continue;
                if(isPrime(Long.parseLong(tmp))) answer++;
                
                tmp="";
            }
            else tmp+=New.charAt(i);
        }
        
        //0P 찾기
        if(tmp.length()!=0){
            if(isPrime(Long.parseLong(tmp))) answer++;
        }
        
        return answer;
    }
    
    public boolean isPrime(Long x){
        if(x==1) return false;
        else{
            for(long i=2; i<=Math.sqrt(x); i++){
                if(x%i==0) return false;
            }
        }
        
        return true;
    }
}