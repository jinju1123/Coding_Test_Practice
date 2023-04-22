class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] str3 = str1.split("");
        String[] str4 = str2.split("");
        for(int i=0; i<str3.length; i++){
            answer += str3[i]+str4[i];
        }
        return answer;
    }
}