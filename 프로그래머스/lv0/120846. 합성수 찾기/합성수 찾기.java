class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int num = 0;
            for(int j=1; j<=i; j++){
                num += (i % j == 0) ? 1 : 0; // 약수의 개수 구하기
            }
            answer += (num >= 3) ? 1 : 0; // 약수의 개수가 3이상인 수 구하기
        }
        return answer;
    }
}