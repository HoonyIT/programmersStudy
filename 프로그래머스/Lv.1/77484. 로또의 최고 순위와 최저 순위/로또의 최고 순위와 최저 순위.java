class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int best = 0;
        int worst = 0;
        
        for(int i=0; i<lottos.length;i++){
            if(lottos[i]==0){
                best ++;
            }    
            else{
                for(int j=0; j<win_nums.length;j++){
                    if(lottos[i]==win_nums[j]){
                        best ++;
                        worst ++;
                    }
                }
            }
        }
        
        if(best != 0){
            answer[0] = 7-best;
        }
        else{answer[0]=6;}
        if(worst != 0){
            answer[1] = 7-worst;
        }
        else{answer[1]=6;}
        
        return answer;
    }
}