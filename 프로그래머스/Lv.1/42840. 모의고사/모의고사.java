import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] a1 = {1,2,3,4,5};
        int A1 = 0;
        int[] a2 = {2,1,2,3,2,4,2,5};
        int A2 = 0;
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        int A3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==a1[i%5]) A1++;
            if(answers[i]==a2[i%8]) A2++;
            if(answers[i]==a3[i%10]) A3++;
        }
        int max = Math.max(A1,A2);
        max = Math.max(max,A3);
        

        if(max==A1){
            list.add(1);
            if(max==A2){
                list.add(2);
                if(max==A3)list.add(3);
            }
            else if(max==A3){
                list.add(3);
            }
        }
        else if(max==A2){
            list.add(2);
            if(max==A3)list.add(3);
        }
        else list.add(3);
        

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}