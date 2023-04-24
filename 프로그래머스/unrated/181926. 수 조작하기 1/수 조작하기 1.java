class Solution {
    public int solution(int n, String control) {
        for(int i=0; i<control.length(); i++){
            if(control.charAt(i)=='w'){
                n = n+1;
            } else if(control.charAt(i)=='s') {
                n = n-1;
            } else if(control.charAt(i)=='d') {
                n = n+10;
            } else {
                n = n-10;
            }
        }
        return n;
    }
}