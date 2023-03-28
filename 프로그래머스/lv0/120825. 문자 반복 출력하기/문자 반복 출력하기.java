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
}