class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int tot = 0;
        
        for(int i=0; i<arr.length; i++){
            tot += arr[i];
        }
        System.out.println(tot);
        answer = (double)tot/arr.length;
        return answer;
    }
}