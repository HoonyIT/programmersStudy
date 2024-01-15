import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int cnt=0; //10구분
        Stack<Integer> stack = new Stack<>();
        
        for(char x: dartResult.toCharArray()){
            if(Character.isDigit(x)) {
                cnt++;
                if(cnt>1){
                    stack.pop();
                    stack.push(10);
                }
                else stack.push(x-48);
            }
            else if(Character.isAlphabetic(x)){
                int tmp=stack.pop();
                if(x=='D') tmp=(int)Math.pow(tmp,2);//tmp*=tmp;
                else if(x=='T') tmp=(int)Math.pow(tmp,3);//tmp*=tmp*tmp;
                stack.push(tmp);
                cnt=0;
            }
            else{
                int tmp2=stack.pop();
                if(x=='#') tmp2*=-1;
                else if(!stack.isEmpty() && x=='*'){
                    int tmp3=stack.pop();
                    tmp3*=2;
                    tmp2*=2;
                    stack.push(tmp3);
                }
                else{
                    tmp2*=2;
                }
                stack.push(tmp2);
                cnt=0;
            }
        }
        while(!stack.isEmpty()) answer+=stack.pop();
        System.out.println((int)Math.pow(2,2));
        return answer;
    }
}