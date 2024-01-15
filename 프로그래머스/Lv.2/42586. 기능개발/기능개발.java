import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<progresses.length; i++){
            int cnt=0;
            while(progresses[i]<100){
                progresses[i]+=speeds[i];
                cnt++;
            }
            list.add(cnt);
        }
        // System.out.println(list);
        
        int max = 1;
        stack.push(list.get(0));
        for(int i=1; i<list.size(); i++){
            if(stack.peek()>=list.get(i)) {
                max++;
            }
            else {
                list2.add(max);
                stack.pop();
                stack.push(list.get(i));
                max=1;
                System.out.println(list2);
            }
        }
        list2.add(max);
        // System.out.println(list2);  
        
        int[] answer = new int[list2.size()];
        for(int i=0; i<list2.size(); i++){
            answer[i] = list2.get(i).intValue();
        }
        return answer;
    }
}