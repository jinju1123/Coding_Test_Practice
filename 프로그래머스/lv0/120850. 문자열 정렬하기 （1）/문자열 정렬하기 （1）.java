import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        // String[] str = my_string.split("");
        // int[] answer = new int[str.length];
        // for(int i=0; i<str.length; i++){
        //    answer[i] = Integer.parseInt(str[i]);
        //}
        // Arrays.sort(answer);
        
        // 이렇게 charAt()(string 값 하나씩 가져옴) 사용해도 가능 
        int[] answer = new int[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0'; // '0'(아스키코드 48)을 빼면 자동형변환되면서 1~됨
        }
        Arrays.sort(answer);
        return answer;
    }
}