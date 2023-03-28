import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String[] arr;
        arr = my_string.split("");
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i].repeat(n);
        }
        String answer = String.join("", arr);
        return answer;
    }
    
    // 선언과 동시에 값 넣기, 문자열 끼리는 합칠때 더하기로 할 수 있잖아 진주야.. join 괜히씀
    // String answer = "";
    // String[] arr = my_string.split("");
    // for(int i=0; i<arr.length; i++) {
    //  answer += arr[i].repeat(n);
    // }
    // return answer;

}