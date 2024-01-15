import java.util.*;
/*XOR
A XOR B

A B Result
1 1 0
1 0 1
0 1 1
0 0 0
*/
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        //정렬
        for(int i=0; i<data.length; i++){
            for(int j=0;j<data.length-1; j++){
                if(data[j][col-1] > data[j+1][col-1]){
                    int[] tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
                else if(data[j][col-1] == data[j+1][col-1]){
                    if(data[j][0] < data[j+1][0]){
                        int[] tmp = data[j];
                        data[j] = data[j+1];
                        data[j+1] = tmp;
                    }
                }
            }
        }

        //s_i
        int[] s = new int[row_end-row_begin+1];
        int index=0;
        for(int i=row_begin-1; i<=row_end-1; i++){
            int tmp=0;
            for(int j=0; j<data[i].length; j++){
                tmp += data[i][j]%(i+1);
            }
            s[index] = tmp;
            index++;
        }
        
        answer=s[0];
        for(int i=1; i<s.length; i++){
            answer = answer^s[i];
        }

        
        return answer;
    }
}