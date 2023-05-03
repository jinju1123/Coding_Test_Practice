import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
//         String answer = "";
//         String a = "";
//         int loop = (my_string.length()/m);
        
//         for(int i=0; i<loop; i++){
//             int lastidx = (i+1) * m;
//             a = my_string.substring(i*m, lastidx);
//             answer += String.valueOf(a.charAt(c-1));
//         }
//         return answer;
        // 간단하게 풀기, 어렵게 풀다가 시간만 날렸네 ㅡㅡ
        String answer = "";
        for(int i=c-1; i<my_string.length(); i+=m) {
            answer += my_string.charAt(i);
        }
        return answer;
        
    }
}