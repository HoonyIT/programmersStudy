import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = bridge_length, sum = 0;
        Queue<Integer> bridge = new LinkedList<>();

        for(int truck : truck_weights){
            while(true){
                if(bridge.size() < bridge_length){
                    if(sum + truck <= weight){
                        bridge.offer(truck);
                        sum += truck;
                        answer++;
                        break;
                    }
                    else{
                        bridge.offer(0);
                        answer++;
                    }
                }
                else{
                    sum -= bridge.poll();
                }
            } 
        } 

        return answer;
    }
}