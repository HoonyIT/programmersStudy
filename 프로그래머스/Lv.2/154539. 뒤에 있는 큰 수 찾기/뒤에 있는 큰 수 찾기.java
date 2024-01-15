import java.util.*;

class Point {
    int index;
    int value;
    public Point(int i, int v){
        this.index = i;
        this.value = v;
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer,-1); //초기화 메서드
        
        Stack<Point> st = new Stack<>();
        
        st.push(new Point(0,numbers[0]));
        
        for(int i=1; i<numbers.length; i++){
            if(st.peek().value<numbers[i]){
                while(!st.isEmpty() && st.peek().value<numbers[i]){
                    answer[st.pop().index] = numbers[i];
                }
            }
            st.push(new Point(i,numbers[i]));
        }
        
        
        
        return answer;
    }
}