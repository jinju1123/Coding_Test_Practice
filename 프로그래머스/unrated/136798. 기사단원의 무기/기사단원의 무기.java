class Solution {
    public int solution(int number, int limit, int power) {
        
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int cnt = 0;
            // 약수를 구할 때 효율성을 위해 반으로 나눠서 구하는게 포인트!
            // 1~√N까지 수 중 N의 약수를 구해 ×2를 해주면 되고, 
            // 약수가 √N인 경우에 제곱근이므로 1개로 카운트해주면 된다.
            for(int j=1; j*j<=i; j++){
                if(j*j==i) {
                    cnt++;
                } else if(i%j==0) {
                    cnt += 2;
                }
            }
            if(cnt>limit) {
                cnt = power;
            }
            answer += cnt;
        }

        return answer;
    }
}