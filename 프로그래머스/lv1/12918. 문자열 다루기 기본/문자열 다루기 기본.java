class Solution {
    public boolean solution(String s) {
//         String s1 = "";
        
//         if(s.length() == 4 || s.length() == 6){
//             s1 = s.replaceAll("[a-zA-Z]", "");
//         } else {
//             return false;
//         }
//         return s.length() == s1.length() ? true : false;
        
        // 정규식 풀이 (^[0-9]*$)는 문자열의 ^시작과 $끝이 [0-9]*숫자로 되어있냐는 의미
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }
}