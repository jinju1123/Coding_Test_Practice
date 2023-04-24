class Solution {
    public int solution(int a, int b) {
        String str = a + "" + b ;
        int num = 2 * a * b ;
        if (Integer.parseInt(str) >= num) {
            return Integer.parseInt(str);
        }
        return num;
    }
}