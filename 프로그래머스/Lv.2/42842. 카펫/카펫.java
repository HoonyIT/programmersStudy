class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x=0,y=0,sum=yellow+brown;
        

        for(int i=1; i<=yellow/2+1; i++){
            if(yellow%i==0){
                y = i;
                x = yellow/i;
                if((x+2)*(y+2) == sum) break;
            }
        }
        answer[0] = x+2;
        answer[1] = y+2;


        return answer;
    }
}