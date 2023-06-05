class Solution {
    public int[] solution(int n, int m) { 
        
        // 최대공약수 구하기 : 유클리드 호제법
        int di = 0;
        
        int a = Math.max(n,m);
        int b = Math.min(n,m);
        
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        di = a;
        
        // 최소공배수 구하기 : (a x b)/최대공약수
        int mul = n * m / di;
        
        int[] answer = {di, mul};
        
        return answer;
    }
}