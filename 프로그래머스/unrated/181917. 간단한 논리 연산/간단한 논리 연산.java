class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        // boolean answer = false;
        // boolean a = false;
        // boolean b = false;
        // if(x1 || x2) {
        //     a = true;
        // } 
        // if(x3 || x4) {
        //     b = true;
        // }
        // if(a && b){
        //     answer = true;
        // }
        // 간단하게 풀기 가능
        return (x1||x2)&&(x3||x4);
    }
}