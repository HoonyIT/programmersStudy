import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int rt = people.length-1;
        int lt = 0;
        
        while(lt<=rt){
            if(lt!=rt && people[lt]+people[rt]<=limit) lt++;
            rt--;
            answer++;
        }
        
        return answer;
    }
}