class Solution {
    public long solution(int balls, int share) {
        if (balls == share)
            return 1;

        long answer = 1;
        int a = (balls - share < share) ? balls - share : share;

        for (int i = 0; i < a; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }

        return answer;
    }
}