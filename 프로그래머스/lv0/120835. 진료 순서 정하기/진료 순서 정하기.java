import java.util.Collections;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
//         int[] eCopy = emergency.clone();
//         Integer[] arr = new Integer[eCopy.length];
//         for(int i=0; i<eCopy.length; i++){
//             arr[i] = eCopy[i];
//         }
//         Arrays.sort(arr, Collections.reverseOrder());
        
//         int[] num = new int[eCopy.length];
//         for(int i=0; i<eCopy.length; i++) {
//             num[i] = i+1;
//         }
        
//         int[] answer = new int[num.length];
//         for(int i=0; i<emergency.length; i++){
//             for(int j=0; j<emergency.length; j++) {
//                 if(emergency[i] == arr[j]){
//                     answer[i] = num[j];
//                 }
//             }
//         }
//         return answer;
        // 자신보다 큰 수가 몇 갠지 세면(1부터 시작) 그게 나의 순서가 된다.
        int[] num = new int[emergency.length];
        
        for(int i=0; i<num.length; i++){
            int count = 1;
            for(int j=0; j<num.length; j++){
                if(emergency[i] < emergency[j]) {
                    count++;
                }
            }
            num[i] = count;
        }
        return num;
    }
}