class Solution {
    public int solution(int n) {
//         int answer = 0;
        
//         for(int i=1; i<=n; i++){
            
//             int num = i;
//             int sum = 0;
            
//             while(true) {
//                 sum += num;
//                 if(sum==n) {
//                     answer++;
//                     break;
//                 } else if (sum>n) {
//                     break;
//                 }
//                 num++;
//             }
            
//         }
        
//         return answer;
        
        // 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 
        // 주어진 수의 홀수 약수(주어진 수의 약수 중 홀수인 수)의 개수와 같다. 
        
        int answer = 0;
        
        for(int i=1; i<=n; i+=2) {
            if(n % i == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}