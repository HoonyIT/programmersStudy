import java.util.*;

class Solution {
    int[] x = {-1,0,0,1,-2,0,0,2,-1,-1,1,1};
    int[] y = {0,1,-1,0,0,2,-2,0,1,-1,1,-1};
    public ArrayList<Integer> solution(String[][] places) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<5; i++){                                 //대기실
            int ck = 0;
            Loop1: for(int j=0; j<5; j++){                      //Row
                        for(int k=0; k<5; k++){                 //Col
                            if(places[i][j].charAt(k)=='P'){    //check
                                for(int q=0; q<12; q++){
                                    int nx = j+x[q];
                                    int ny = k+y[q];
                                    if(nx>=0 && ny>=0 && nx<5 && ny<5){
                                        if(places[i][nx].charAt(ny)=='P'){
                                            //px
                                            if(q<4){
                                                list.add(0);
                                                ck=1;
                                                break Loop1;
                                            }
                                            //p1
                                            else if(q<8){
                                                if(nx>j && places[i][nx-1].charAt(ny)=='O' || 
                                                   nx==j && ny>k && places[i][nx].charAt(ny-1)=='O' || 
                                                   nx==j && ny<k && places[i][nx].charAt(ny+1)=='O' || 
                                                   nx<j && places[i][nx+1].charAt(ny)=='O'
                                                  ){
                                                    list.add(0);
                                                    ck=1;
                                                    break Loop1;
                                                }
                                            }
                                            //p2
                                            else{
                                                if(nx>j && ny>k && (places[i][nx-1].charAt(ny)=='O' || places[i][nx].charAt(ny-1)=='O') ||
                                                   nx>j && ny<k && (places[i][nx-1].charAt(ny)=='O' || places[i][nx].charAt(ny+1)=='O') ||
                                                   nx<j && ny>k && (places[i][nx+1].charAt(ny)=='O' || places[i][nx].charAt(ny-1)=='O') ||
                                                   nx<j && ny<k && (places[i][nx+1].charAt(ny)=='O' || places[i][nx].charAt(ny+1)=='O') 
                                                  ){
                                                    list.add(0);
                                                    ck=1;
                                                    break Loop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                }
            if(ck!=1) list.add(1);
        }
        
        
        return list;
    }
}