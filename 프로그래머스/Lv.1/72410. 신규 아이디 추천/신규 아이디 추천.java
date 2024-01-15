import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        int cnt=0;
        int size=0;
        StringBuilder str = 
            new StringBuilder(new_id.toLowerCase().replaceAll("[~!@#$%^&*()=+\\[{\\]}:?,<>/]","")); //1,2
        //대괄호 제거 \\[
        
        StringBuilder tmp = 
            new StringBuilder(new_id.toLowerCase().replaceAll("[~!@#$%^&*()=+\\[{\\]}:?,<>/]",""));
        
        for(int i=0; i<tmp.length(); i++){//3
            if(tmp.charAt(i)=='.'){
                cnt++;
                if(cnt>1){
                    str.delete(i-size,i+1-size);
                    size++;
                    cnt=1;
                }
            }
            else cnt=0;
        }
        
        //4,5,6
        if(str.charAt(0)=='.') str.delete(0,1);
        if(str.length()==0) str.append('a');
        else if(str.length()>15) {
            str.delete(15,str.length());
        }
        if(str.charAt(str.length()-1)=='.') str.delete(str.length()-1,str.length());
        
        
        //7
        if(str.length()<=2) {
            while(str.length()<3) str.append(str.charAt(str.length()-1));
        }
        System.out.println(str);
        
        answer = str.toString();
        return answer;
        
        
        //모범답안
//         String temp = new_id.toLowerCase();

//         temp = temp.replaceAll("[^-_.a-z0-9]","");
//         System.out.println(temp);
//         temp = temp.replaceAll("[.]{2,}",".");
//         temp = temp.replaceAll("^[.]|[.]$","");
//         System.out.println(temp.length());
//         if(temp.equals(""))
//             temp+="a";
//         if(temp.length() >=16){
//             temp = temp.substring(0,15);
//             temp=temp.replaceAll("^[.]|[.]$","");
//         }
//         if(temp.length()<=2)
//             while(temp.length()<3)
//                 temp+=temp.charAt(temp.length()-1);

//         answer=temp;
//         return answer;
    }
}