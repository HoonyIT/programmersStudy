class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            int cnt = food[i]/2;
            if(cnt!=0){
                for(int j=0; j<cnt; j++) answer+=i;
            }
        }
        answer+=0;
        int len=answer.length();
        for(int i=len-2; i>=0; i--) answer+=answer.charAt(i);
        return answer;
    }
}