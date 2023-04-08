class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=1000; i++){
            if((n*i)%6==0){
                answer = (n*i)/6;
                break;
            }
        }

        
        return answer;
    }
}