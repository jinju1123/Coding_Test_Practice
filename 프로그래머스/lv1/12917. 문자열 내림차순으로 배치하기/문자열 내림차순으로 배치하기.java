import java.util.*;
class Solution {
    public String solution(String s) {
        
//         String[] strArr = s.split("");
//         Arrays.sort(strArr, Collections.reverseOrder());
//         return String.join("", strArr);
        
        // StringBuilder와 친해지기
        
//        char[] charArr = s.toCharArray();
//        Arrays.sort(charArr);
        
        // String.valueOf는 매개변수 값을 String 생성자 함수에 전달 후 새로운 문자열 객체를 반환함
        // String.valueOf는 char[]을 String으로 반환해준다. 배열 중에선 문자 배열만 가능한듯
//        StringBuilder sb = new StringBuilder(String.valueOf(charArr));
//        sb.reverse();
        
//        return sb.toString();
        
        
        char[] sArr = s.toCharArray();
        
        Arrays.sort(sArr);
        
        StringBuilder sb = new StringBuilder(String.valueOf(sArr));
        
        sb.reverse();
        
        return sb.toString();
        
        
    }
}