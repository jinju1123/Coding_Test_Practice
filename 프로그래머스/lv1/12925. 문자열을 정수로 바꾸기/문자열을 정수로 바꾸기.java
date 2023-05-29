class Solution {
    public int solution(String s) {
        // int answer = 0;
        // if(s.charAt(0)=='+'){
        //     s = s.replaceAll("\\+", "");
        //     answer = Integer.parseInt(s);
        // } else {
        //     answer = Integer.parseInt(s);
        // }
        // return answer;
        
        // ??????????? 자바가 문자+를 그냥 숫자+로 인식하는지 몰랐다 
        return  Integer.parseInt(s);
    }
}