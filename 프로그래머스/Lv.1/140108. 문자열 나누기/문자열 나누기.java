class Solution {
    public int solution(String s) {
        int answer = 1;
        int first = 1;
        int another = 0;
        char[] c = s.toCharArray();
        char c1 = c[0];
        for(int i=1; i<c.length; i++){
            System.out.println(i);
            if(c1 == c[i]){
                first++;
                System.out.println("if");
            }
            else{
                another++;
                System.out.println("else");
                if(first == another){
                    answer++;
                    first = 0;
                    another = 0;
                    System.out.println("else if");
                    if(i+1 < c.length) c1 = c[i+1];
                    if(i == c.length-1) answer--;
                }
            }
        }
        
        return answer;
    }
}