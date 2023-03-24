class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 7 == 0){
            answer = n/7;
        } else {
            answer = n/7 + 1;
        }
        return answer;
    }
    
    // 짧게 삼항연산자 사용하기
    // return n % 7 == 0 ? n/7 : n/7 + 1;
}