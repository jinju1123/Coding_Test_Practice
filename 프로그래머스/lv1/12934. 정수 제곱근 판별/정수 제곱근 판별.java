class Solution {
    public long solution(long n) {
        
        long answer = 0;
        
        long sn = (long)Math.sqrt(n);
        
        if(sn*sn == n) {
            answer = (sn + 1) * (sn + 1);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}