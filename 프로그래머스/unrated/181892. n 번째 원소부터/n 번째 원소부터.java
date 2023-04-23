import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        // int[] answer = new int[num_list.length-n+1];
        // for(int i=0; i<answer.length; i++){
        //     answer[i] += num_list[n-1];
        //     n++;
        // }
        // return answer;
        
        // 간단하게 풀기 Arrays.copyOfRange(원본배열, 복사시작 인덱스, 복사끝 인덱스+1);
        return Arrays.copyOfRange(num_list, n-1, num_list.length);
    }
}