class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++){
           answer += make_prime(i);
        }
        
        return answer;
    }
    
    public int make_prime(int n) {
        
        if(n==2) return 1;

        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i==0) return 0;
        }
        
        return 1;
    }
}