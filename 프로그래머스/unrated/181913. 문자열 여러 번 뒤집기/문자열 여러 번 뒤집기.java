class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int i=0; i<queries.length; i++){
            String start = my_string.substring(0, queries[i][0]);
            String end = my_string.substring(queries[i][1]+1);
            String middle = my_string.substring(queries[i][0], queries[i][1]+1);
            
            StringBuffer sb = new StringBuffer(middle);
            String reverse = sb.reverse().toString();
            
            answer = start+reverse+end;
            my_string = answer;
        }
        return answer;
    }
}