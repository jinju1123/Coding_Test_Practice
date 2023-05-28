import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        // 문자열로 만들어서 뒤집기
        String str = String.valueOf(n);
        StringBuffer sb = new StringBuffer(str);
        String reStr = sb.reverse().toString();
        
        // int 배열 만들어서 넣기
        int[] answer = new int[reStr.length()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = reStr.charAt(i) - '0';
        }
        
        return answer;
    }
}