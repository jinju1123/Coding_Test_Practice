import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String a = "";
        int loop = (my_string.length()/m);
        
        for(int i=0; i<loop; i++){
            int lastidx = (i+1) * m;
            a = my_string.substring(i*m, lastidx);
            answer += String.valueOf(a.charAt(c-1));
        }
        return answer;
    }
}