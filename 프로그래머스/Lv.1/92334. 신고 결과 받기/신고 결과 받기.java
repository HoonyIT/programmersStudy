import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        // 한 유저가 같은 유저를 신고한 경우를 제외함.
        List<String> noRedun = new ArrayList<>(new HashSet<>(Arrays.asList(report)));
        Map<String,Integer> reported = new HashMap<>();  // 유저별 신고당한 횟수
        Map<String, ArrayList<String>> relation = new HashMap<>();   // 유저별 신고 관계
        int[] answer = new int[id_list.length];          // 정답
        int n_size = noRedun.size();
        int id_size = id_list.length;

        for(int i=0;i<id_size;i++){  // 이용자를 위한 신고 서비스 생성
            relation.put(id_list[i],new ArrayList<>()); // 관계
            reported.put(id_list[i],0); // 횟수
        }

        for(int j=0;j<n_size;j++){   // (이용자 신고자) 배열을 순회

            String[] member = noRedun.get(j).split(" ");        // (이용자 신고자)
            ArrayList<String> check = relation.get(member[0]);  // 이용자의 신고자 목록을 가져옴    
            check.add(member[1]);   // 신고자 목록 추가
            relation.put(member[0],check);  // 신고 관계 추가
            reported.put(member[1],reported.get(member[1])+1);  // 이전 횟수에 1을 더함
        }    

        for(int i=0; i<id_size; i++){

            List<String> reId = relation.get(id_list[i]);   // 사용자가 신고한 ID들을 받아옴.

            if(reId != null){
                for(String user : reId){   // 유저별 신고당한 횟수를 순회

                    // 사용자가 신고한 유저가 정지 기준에 도달했다면
                    if(reported.get(user) >= k){
                        answer[i]++;          // 처리 결과 메일 수 증가
                    }
                }    
            }

        }

        return answer;
    }
}