class Solution {
    public long solution(long n) {
//         long answer = -1;
//         long x = 0;
//         long i = 1;
        
//         while(i*i<=n){
//             if(i*i==n) {
//                 answer = 1;
//                 x = i;
//                 break;
//             } 
//             i++;
//         }
        
//         if(answer == 1) {
//             answer = (x+1)*(x+1);
//         }
        
//         return answer;
        
        // ㅎㅎ pow와 sqrt는 생각했지만 이런 방법은 생각 못했다..
        // sqrt는 double로 나와서 int를 해준듯
        
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
        
    }
}