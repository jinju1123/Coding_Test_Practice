class Solution {
    public int solution(int[] arr) {
        
        // 반복문을 통해 n개의 최소공배수 구하기
        int answer = arr[0];
        
        for(int i=1; i<arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
    
    // 최소 공배수 구하는 함수
    public int lcm(int a, int b) {
        return a*b / gcd(a,b);
    }
    
    // 최대 공약수 구하는 함수 : 유클리드 호제법 (재귀방식)
    public int gcd(int x, int y) {
        if(y==0) return x;
        return gcd(y, x % y);
    }
    
}