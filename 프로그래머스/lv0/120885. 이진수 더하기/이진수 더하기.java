class Solution {
    public String solution(String bin1, String bin2) {
        // String answer = "";
        // int num1 = Integer.parseInt(bin1, 2);
        // int num2 = Integer.parseInt(bin2, 2);
        // int sum = num1 + num2;
        // return answer = Integer.toBinaryString(sum);
        // 간단하게 줄이기
        return Integer.toBinaryString(Integer.parseInt(bin1, 2)+Integer.parseInt(bin2, 2));
    }
}