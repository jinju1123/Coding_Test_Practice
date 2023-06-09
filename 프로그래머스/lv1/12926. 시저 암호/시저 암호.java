class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            
            // 대문자일 경우
            if(Character.isUpperCase(s.charAt(i))){
                if('Z'-s.charAt(i)<n) {
                    int num = s.charAt(i) - 26 + n;
                    answer += (char)num;
                } else if(s.charAt(i) != ' ') {
                    int num = s.charAt(i) - 0 + n;
                    answer += (char)num;
                }
                
            // 소문자일 경우
            } else if(Character.isLowerCase(s.charAt(i))) {
                if('z'-s.charAt(i)<n) {
                    int num = s.charAt(i) - 26 + n;
                    answer += (char)num;
                } else if(s.charAt(i) != ' ') {
                    int num = s.charAt(i) - 0 + n;
                    answer += (char)num;
                }
                
            // 공백일 경우
            } else if(s.charAt(i) == ' ') {
                answer += ' ';
            }
        }
        return answer;
    }
}