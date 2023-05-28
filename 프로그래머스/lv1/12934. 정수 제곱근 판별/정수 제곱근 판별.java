class Solution {
    public long solution(long n) {
        long answer = -1;
        long x = 0;
        long i = 1;
        
        while(i*i<=n){
            if(i*i==n) {
                answer = 1;
                x = i;
                break;
            } 
            i++;
        }
        
        if(answer == 1) {
            answer = (x+1)*(x+1);
        }
        
        return answer;
    }
}