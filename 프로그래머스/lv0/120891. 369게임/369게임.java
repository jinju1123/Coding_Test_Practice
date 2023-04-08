import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // 문자열 변환 방식
        //String str = ""+order;
        //for(int i=0; i<str.length(); i++){
        //    if( str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
        //        answer++;
        //    }
        //}
        //return answer;
        
        // while문 이용 방식
        while(order != 0) {
            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9) answer++;
            order /= 10;
        }
        return answer;
        
    }
}