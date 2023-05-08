import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        // int[]을 생성하고 각 원소의 길이를 배열에 넣는게 핵심
        int[] arr = new int[strArr.length];
        for(int i=0; i<strArr.length; i++){
            arr[strArr[i].length()] += 1; 
        }
        
        // int max = arr[0];
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        
        int max = 0;
        for(int i : arr){
            max = Math.max(max, i);
        }
        return max;
    }
}