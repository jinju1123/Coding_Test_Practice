class Solution {
    public int[] solution(long n) {
        
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        String str = sb.reverse().toString();
        
        int[] answer = new int[str.length()];
        
        for(int i=0; i<str.length(); i++) {
            answer[i] = str.charAt(i) - '0';
        }
        
        return answer;
    }
}