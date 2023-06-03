class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i=1; i<=count; i++){
            int pri = price;
            pri *= i;
            answer += pri;
        }

        return answer > money ? answer-money : 0 ;
    }
}