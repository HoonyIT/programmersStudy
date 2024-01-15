class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        for(char x : s.toCharArray()){
            if(s.length()!=4 && s.length()!=6) return false;
            else{
                if(x<48 || x>57) return false;
            }
        }
        
        return answer;
    }
}