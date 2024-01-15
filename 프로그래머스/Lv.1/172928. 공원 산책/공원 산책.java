import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        char[][] PARK = new char[park.length][];
        int i=0,j=0;
        
        for(int k=0; k<park.length; k++){
            PARK[k] = park[k].toCharArray();
            for(int r=0; r<PARK[k].length; r++) if(PARK[k][r]=='S'){i=k;j=r;}
        }

        
        for(String s: routes){
            char[] c =  s.toCharArray();
            int o=1;
            if(c[0]=='E'){
                for(; o<=c[2]-48; o++){
                    if(j+o>=PARK[i].length || PARK[i][j+o]=='X') break;
                }
                if(o>c[2]-48) j+=c[2]-48;
            }
            else if(c[0]=='W'){
                 for(; o<=c[2]-48; o++){
                    if(j-o<0 || PARK[i][j-o]=='X') break;
                }
                if(o>c[2]-48) j-=c[2]-48;
            }
            else if(c[0]=='S'){
                for(; o<=c[2]-48; o++){
                    if(i+o>=PARK.length || PARK[i+o][j]=='X') break;
                }
                if(o>c[2]-48) i+=c[2]-48;
            }
            else{
                for(; o<=c[2]-48; o++){
                    if(i-o<0 || PARK[i-o][j]=='X') break;
                }
                if(o>c[2]-48) i-=c[2]-48;
            }
        }
        answer[0] = i;
        answer[1] = j;
        
        return answer;
    }
}