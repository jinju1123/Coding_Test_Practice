import java.util.Arrays;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = my_string.split("");
        answer = str[num1];
        str[num1] = str[num2];
        str[num2] = answer;
        return answer = String.join("", str);
    }
}