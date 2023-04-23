import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        // Arrays.sort(num_list);
        // int[] answer = new int[num_list.length-5];
        // for(int i=0; i<answer.length; i++){
        //     answer[i] = num_list[i+5];
        // }
        // return answer;
        
        // 간단하게 풀기
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}