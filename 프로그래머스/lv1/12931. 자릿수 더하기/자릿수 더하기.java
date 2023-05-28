import java.util.*;

public class Solution {
    public int solution(int n) {
        
//         int answer = 0;
//         String nstr = ""+n;
        
//         for(int i=0; i<nstr.length(); i++){
//             answer += nstr.charAt(i) - '0';
//         }

//         return answer;
        
        // 다른 방식 코드
        
        int answer = 0;
        
        while(true) {
            answer += n%10;
            if(n<10)
                break;
            n /= 10;
        }
        
        return answer;
    }
}