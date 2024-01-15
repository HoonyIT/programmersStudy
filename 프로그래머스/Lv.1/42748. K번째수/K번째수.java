import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            list.clear();
            for(int j=commands[i][0]; j<=commands[i][1]; j++){
                list.add(array[j-1]);
            }
            Collections.sort(list);
            answer[i]=list.get(commands[i][2]-1).intValue();
        }
        
        return answer;
    }
}