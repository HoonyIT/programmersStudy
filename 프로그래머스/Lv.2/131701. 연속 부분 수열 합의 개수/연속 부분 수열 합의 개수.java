import java.util.*;
class Solution {
    public int solution(int[] elements) {

        HashSet<Integer> set = new HashSet<>();
        
        
        for(int i=1; i<=elements.length; i++){ // i==길이
            for(int j=0; j<elements.length; j++){
                int sum=0;
                for(int k=0; k<i; k++){
                    int idx = j+k;
                    if(idx>=elements.length) idx-=elements.length;
                    sum+=elements[idx];
                }
                set.add(sum);
            }
        }
        
        
        return set.size();
    }
}