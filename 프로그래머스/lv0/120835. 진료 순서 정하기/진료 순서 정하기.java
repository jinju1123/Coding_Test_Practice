import java.util.Collections;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] eCopy = emergency.clone();
        Integer[] arr = new Integer[eCopy.length];
        for(int i=0; i<eCopy.length; i++){
            arr[i] = eCopy[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        int[] num = new int[eCopy.length];
        for(int i=0; i<eCopy.length; i++) {
            num[i] = i+1;
        }
        
        int[] answer = new int[num.length];
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++) {
                if(emergency[i] == arr[j]){
                    answer[i] = num[j];
                }
            }
        }
        return answer;
    }
}