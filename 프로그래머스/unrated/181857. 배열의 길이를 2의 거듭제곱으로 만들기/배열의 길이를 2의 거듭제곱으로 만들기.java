import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
//         List<Integer> list = new ArrayList<>();
//         for(int i : arr){
//             list.add(i);
//         }
        
//         int temp = 1;
//         Integer arrLen = arr.length;
        
//         while(true) {
//             if(arrLen.compareTo(temp) == -1){
//                 for(int i=0; i<temp-arr.length; i++){
//                     list.add(0);
//                 }
//                 break;
//             }
            
//             if (arrLen.compareTo(temp) == 0) break;
            
//             temp *= 2;
//         }
//         return list.stream().mapToInt(i->i).toArray();
        
        // 나 또 어렵게 풀었네... 쉽게 푸는 방법
        int len = arr.length;
        int tmp = 1;

        // Point : while문을 통해 len보다 큰 2의 정수 거듭제곱을 먼저 구하기
        while (tmp < len) {
            tmp *= 2;
        }
        
        int[] answer = new int[tmp];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}