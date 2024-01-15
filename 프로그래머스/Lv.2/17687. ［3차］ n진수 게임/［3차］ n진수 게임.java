import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int num=0;
        while(sb.length()<t*m){
            sb.append(conversion(num,n));
            num++;
        }
        
        int i=p-1;
        while(answer.length()<t){
            answer+=sb.toString().charAt(i);
            i+=m;
        }

        return answer;
    }
    
    public String conversion(int num, int n) {
        StringBuilder tmp = new StringBuilder();
        while(num>=n){
            int x = num%n;
            switch(x){
                case 10: tmp.append("A"); break;
                case 11: tmp.append("B"); break;
                case 12: tmp.append("C"); break;
                case 13: tmp.append("D"); break;
                case 14: tmp.append("E"); break;
                case 15: tmp.append("F"); break;
                default: tmp.append(x);
            }
            num/=n;
        }
        
        switch(num){
                case 10: tmp.append("A"); break;
                case 11: tmp.append("B"); break;
                case 12: tmp.append("C"); break;
                case 13: tmp.append("D"); break;
                case 14: tmp.append("E"); break;
                case 15: tmp.append("F"); break;
                default: tmp.append(num);
        }
        return tmp.reverse().toString();
    }
}