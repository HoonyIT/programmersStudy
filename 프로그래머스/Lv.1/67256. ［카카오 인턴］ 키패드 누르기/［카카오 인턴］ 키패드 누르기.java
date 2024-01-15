import java.util.*;

class arrayy{
    int x;
    int y;
    arrayy(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] c = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                        {0,0,0}
                      };
        arrayy tmpL = new arrayy(3,0);
        arrayy tmpR = new arrayy(3,2); 
        
        for(int x: numbers){
            if(x==1||x==4||x==7){
                for(int i=0; i<4; i++) if(x==c[i][0]){
                  tmpL.x = i;
                  tmpL.y = 0;
                } 
                answer+="L";
            }
            else if(x==3||x==6||x==9){
                for(int i=0; i<4; i++) if(x==c[i][2]) {
                    tmpR.x = i;
                    tmpR.y = 2;
                }
                answer+="R";
            }
            else{
                for(int i=0; i<4; i++){
                    if(x==c[i][1]){
                        int dL = Math.abs(tmpL.x-i) + Math.abs(tmpL.y-1);
                        int dR = Math.abs(tmpR.x-i) + Math.abs(tmpR.y-1);
                        if(dL>dR){
                            tmpR.x = i;
                            tmpR.y = 1;
                            answer+="R";
                        }
                        else if(dL<dR){
                            tmpL.x = i;
                            tmpL.y = 1;
                            answer+="L";
                        }
                        else{
                            if(hand.equals("right")){
                                tmpR.x = i;
                                tmpR.y = 1;
                                answer+="R";
                            }
                            else{
                                tmpL.x = i;
                                tmpL.y = 1;
                                answer+="L";
                            }
                        }
                    }
                }
            }
            System.out.println("L("+tmpL.x+","+tmpL.y+")"+"R("+tmpR.x+","+tmpR.y+")");
        }

        return answer;
    }
}