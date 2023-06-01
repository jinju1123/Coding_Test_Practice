class Solution {
    public String solution(String s) {
        // String answer = "";
        // if(s.length()%2!=0){
        //     answer = ""+s.charAt(s.length()/2);
        // } else {
        //     answer = ""+s.charAt(s.length()/2-1)+s.charAt(s.length()/2);
        // }
        // return answer;
        
        // 속도에 차이가 있나?
        return s.substring((s.length()-1)/2, s.length()/2 + 1);
    }
}