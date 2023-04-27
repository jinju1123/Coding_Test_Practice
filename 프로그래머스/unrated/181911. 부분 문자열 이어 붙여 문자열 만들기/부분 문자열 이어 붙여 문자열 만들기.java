class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0; i<my_strings.length; i++){
            my_strings[i] = my_strings[i].substring(parts[i][0],parts[i][1]+1);
        }
        for(String s : my_strings){
            answer += s;
        }
        return answer;
    }
}