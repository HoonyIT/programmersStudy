class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        
        if(answer<attacks[0][1]) return -1; //첫타에 죽음
        
        answer-=attacks[0][1];
        for(int i=1; i<attacks.length; i++){ //second
            int diffTime = attacks[i][0]-attacks[i-1][0]-1;
            
            answer+=diffTime*bandage[1];
            if(diffTime>=bandage[0]) answer+= bandage[2]*(diffTime/bandage[0]);
            if(answer>health) answer=health;
            
            
            answer-=attacks[i][1];
            if(answer<=0) return -1;
        }
        
        
        return answer;
    }
}