import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        // String[] arr = my_string.split(" ");
        // List<String> list = new ArrayList<>(Arrays.asList(arr));
        // list.removeAll(Arrays.asList(""));
        // String[] answer = list.toArray(new String[0]);
        // return answer;
        
        // 정규식으로 초간단 풀수 있음.. 정규식 짱이다
        // return my_string.trim().split("\\s+"); //  \s가 1개 이상의 공백문자를 표현
        // 또는 이렇게도 가능
        return my_string.trim().split("[ ]+"); //  [ ]는 공백문자열의 집합을 표현 
    }
}