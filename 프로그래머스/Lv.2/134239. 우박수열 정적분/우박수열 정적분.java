import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        while(k>1){
            list.add(k);
            if(k%2==0) k/=2;
            else k=k*3+1;
        }
        list.add(k);
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        list.clear();

        
        //사다리꼴 넓이: ((윗변+아랫변)*높이)/2
        for(int i=0; i<ranges.length; i++){
            int s = ranges[i][0];
            int e = arr.length+ranges[i][1]-1;
            double sum = 0.0;
            
            if(s>e){
                answer[i]=-1.0;
                continue;
            }
            
            while(s<e){
                sum+=(arr[s]+arr[s+1])/2.0;
                s++;
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}