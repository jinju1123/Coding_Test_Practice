import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        // Arrays.copyOfRange(배열, 시작인덱스, **끝나는인덱스의 다음인덱스**)
        return answer;
    }
}