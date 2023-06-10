class Solution {
    public int solution(int n) {
        
        // 피보나치 수열은 int 범위가 금방 넘어가기 때문에 항상 주의 해야한다.
        // (A+B)%C == (A%C)+(B%C)%C 기억하기!
        
        int[] answer = new int[n+1];
        
        for(int i=0; i<=n; i++){
            if(i==0){
                answer[i] = 0;
            } else if(i==1){
                answer[i] = 1;
            } else {
                int sum = answer[i-1] + answer[i-2];
                answer[i] = sum % 1234567;
            }
        }
        
        return answer[n];
    }
}