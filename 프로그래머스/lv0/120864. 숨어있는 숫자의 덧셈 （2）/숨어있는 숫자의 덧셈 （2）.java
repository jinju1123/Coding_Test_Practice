class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[^0-9]", " ").split(" ");
        for( String n : str ) {
            answer += !n.equals("") ? Integer.parseInt(n) : 0;  
        }
        return answer;
    }
}