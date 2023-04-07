import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        // 오름차순하면 음수부터 양수까지 쭉 정렬
        Arrays.sort(numbers);
        
        // 처음 두 개, 혹은 마지막 두 개의 곱중 큰수가 가장 최댓값임(오름차순 했으니까ㅡㅡ)
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if(num1 > num2) {
            return num1;
        } else
            return num2;
    }
}