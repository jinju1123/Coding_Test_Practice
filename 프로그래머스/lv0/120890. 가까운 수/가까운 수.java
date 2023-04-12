import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] array, int n) {
        // n의 제일 큰수가 100이라서 min을 100으로 설정
        // Math.abs는 절대값 표시! 음수, 양수 상관 X
        // 제일 작은 값을 min에 넣기
        int min = 100;
        for(int i=0; i<array.length; i++){
            if(Math.abs(array[i]-n) < min){
                min = Math.abs(array[i]-n);
            }
        }
        
        // 새로운 배열을 담을 List 생성하고 min이 나온 array[i]를 담기
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            if(Math.abs(array[i]-n) == min){
                arr.add(array[i]);
            }
        }
        
        // 오름차순으로 정리해서 제일 작은 수를 0번으로 오게 배치
        Collections.sort(arr);
        
        return arr.get(0);
        
        
        // 간단하게 풀기
        // int answer = 0;
        // Arrays.sort(array);
        // for(int i = 1 ; i < array.length ; i++){
        //     if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
        //         array[0] = array[i];
        //     }
        // }
        // answer = array[0];
        // return answer;
    }
}