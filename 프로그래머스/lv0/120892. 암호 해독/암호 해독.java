class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = 1; i<=cipher.length()/code; i++){
        answer += cipher.charAt((code*i)-1);
        }
        return answer;
    }
}