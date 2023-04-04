
class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        double num = Math.pow(2,t);
        return answer = n * (int)num;
        // 어렵게 생각하지 않아도 된다.
        // for(int i=0; i<t; i++) {
        //    n *= 2
        // }
        // return n;
        // i가 식 안에 없어도 된다. 돌기만 하면 되니까... 이걸 몰랐네ㅡㅡ
    }
}