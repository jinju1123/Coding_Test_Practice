class Solution {
    public int solution(int a, int b) {
        String num1 = (a+"")+(b+"");
        String num2 = (b+"")+(a+"");
        if(Integer.parseInt(num1)>=Integer.parseInt(num2)){
            return Integer.parseInt(num1);
        } else {
            return Integer.parseInt(num2);
        }
    }
}