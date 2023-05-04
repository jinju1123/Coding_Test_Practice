import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a-c]"," ").trim();
        String[] answer = myStr.split("\\s+");
        if(answer[0].equals("")){
            answer[0] = "EMPTY";
        }
        return answer;
    }
}