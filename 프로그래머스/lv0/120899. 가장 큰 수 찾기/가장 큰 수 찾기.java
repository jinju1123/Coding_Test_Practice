import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] array) {
//         List<Integer> list = new ArrayList<>();
//         int max = array[0];
//         int a = 0;
//         for(int i=0; i<array.length; i++){
//             if(array[i] > max) {
//                 max = array[i];
//                 a = i;
//             }
//         }
//         list.add(max);
//         list.add(a);
        
//         int[] answer = new int[list.size()];
//         for(int i=0; i<list.size(); i++){
//             answer[i] = list.get(i);
//         }
//         return answer;
        
        // 너무 간단하게 풀 수 있다.. 어차피 결과는 무조건 원소 2개의 배열
        int[] answer = new int[2];
        for(int i=0; i<array.length; i++){
            if(array[i] > answer[0]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}