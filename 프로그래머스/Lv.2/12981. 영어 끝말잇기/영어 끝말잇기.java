import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int[] check = new int[n+1];
        HashSet<String> set = new HashSet<>();
        
        for(int i=0; i<words.length; i++){
            if(words[i].length()==1 ||
              i!=0 && words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0) ||
              set.contains(words[i]))
            {
                answer[0] = i%n + 1;
                answer[1] = check[i%n] +1;
                break;
            }
            else{
                check[i%n]++;
                set.add(words[i]);
            }
        }


        return answer;
    }
}