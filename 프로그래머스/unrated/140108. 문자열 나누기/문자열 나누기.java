class Solution {
    public int solution(String s) {
        
        int answer = 0;
        
        while(s.length() != 0) {
            
            char ch = s.charAt(0);
            int x = 1;
            int y = 0;
            
            for(int i=1; i<s.length(); i++) {
                if(ch == s.charAt(i)) {
                    x++;
                } else {
                    y++;
                }
                
                if(x == y) break;
            }         
            
            answer++;
            s = s.substring(x+y);
        }

        return answer;
    }
}