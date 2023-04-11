class Solution {
    public int solution(int n) {
        int x = 1;
        int i = 0;
        while(x<=n){
            i++;
            x *= i;
        }

        return i-1;
    }
}