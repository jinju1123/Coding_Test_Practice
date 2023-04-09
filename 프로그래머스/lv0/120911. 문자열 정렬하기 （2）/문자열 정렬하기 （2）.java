import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // my_string = my_string.toLowerCase();
        // char[] ch = my_string.toCharArray();
        // Arrays.sort(ch);
        // my_string = new String(ch);
        // return my_string;
        // 간단하게 수정 가능
        char[] ch = my_string.toLowerCase().toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}