class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int len = p.length();
        int range = t.length()-len;
        
        for(int i=0; i<t.length(); i++){
            if(i <= range) {
                String t1 = t.substring(i, len+i);
                if(Long.parseLong(t1) <= Long.parseLong(p)) answer++;
            }
        }
        
        return answer;
    }
}