class Solution
{
    int answer = 0;
    
    public void DFS(int L, int A, int B){
        if(A%2==0 && B==A-1 || A%2!=0 && B==A+1){
            answer=L;
            return;
        }
        else{
           if(A%2==0 && B%2==0) DFS(L+1, A/2, B/2);
           else if(A%2==0 && B%2!=0) DFS(L+1, A/2, (B+1)/2);
           else if(A%2!=0 && B%2==0) DFS(L+1,(A+1)/2, B/2);
           else DFS(L+1, (A+1)/2, (B+1)/2);
        }
    }
    
    public int solution(int n, int a, int b)
    {
        DFS(1,a,b);
        return answer;
    }
}