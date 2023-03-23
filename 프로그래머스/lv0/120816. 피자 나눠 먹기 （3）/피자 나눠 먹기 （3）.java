class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if((slice*i)>=n) {
                answer=i;
                break;
            }
        }
        return answer;
    }
}