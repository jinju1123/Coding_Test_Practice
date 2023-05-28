class Solution {
    public int solution(int n) {
        
//         int answer = 0;
//         int min = Integer.MAX_VALUE;
        
//         for(int i=1; i<n; i++){
//             if(n % i == 1){
//                 if(i<min){
//                     min = i;
//                     answer = min;
//                 }
//             }   
//         }
//         return answer;
        
        // 나 바본가.. break 걸면 되는걸..
        
        int answer = 0;
        
        for(int i=1; i<n; i++){
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;

    }
}