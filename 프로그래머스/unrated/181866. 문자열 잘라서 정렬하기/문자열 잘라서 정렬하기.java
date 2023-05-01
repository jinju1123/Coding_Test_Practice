import java.util.*;

class Solution {
    public String[] solution(String myString) {
        myString = myString.replaceAll("x", " ");
        String[] answer = myString.trim().split("\\s+");
        Arrays.sort(answer);
        return answer;
    }
}