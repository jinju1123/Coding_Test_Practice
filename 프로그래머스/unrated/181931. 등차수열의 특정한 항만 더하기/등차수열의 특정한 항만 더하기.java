import java.util.*;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
//         List<Integer> list = new ArrayList<>();
//         for(int i=a, j=0; j<=included.length; i+=d, j++){
//             list.add(i);
//         }
        
//         for(int i=0; i<included.length; i++){
//             if(included[i]){
//                 answer += list.get(i);
//             }
//         }
//         return answer;
        // 괜히 복잡하게 풀었잖아..
        for(int i=0; i<included.length; i++){
            if(included[i]){
            answer += a + (d*i);
            }
        }
        return answer;
    }
}