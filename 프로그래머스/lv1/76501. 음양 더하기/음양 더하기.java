class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
//         int answer = 0;
        
//         for(int i=0; i<signs.length; i++){
//             if(!signs[i]){
//                 absolutes[i] *= -1;
//             }
//         }
        
//         for(int i : absolutes) {
//             answer += i;
//         }
        
//         return answer;
        
        // 이렇게 풀면 더 간단!
        
        int answer = 0;
        
        for(int i=0; i<signs.length; i++){
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }
        
        return answer;
        
    }
}