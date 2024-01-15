import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        //1(빵), 2(야채), 3(고기)  --> 1231
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<ingredient.length;i++){
            stack.push(ingredient[i]);
            if(stack.size()>3&&
                stack.peek()==1&&
                stack.get(stack.size()-2)==3&&
                stack.get(stack.size()-3)==2&&
                stack.get(stack.size()-4)==1
            ){
                answer++;
                for(int j=0;j<4;j++) stack.pop();
            }
        }
        
        return answer;
    }
}