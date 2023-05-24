class Solution {
    public int solution(int n) {
        
//         int town3x = 0;
//         int num10 = 1;
//         String numStr = "";
        
//         while(true){
            
//             // 3의 배수거나 문자 3이 들어가면 넘기기
//             numStr = String.valueOf(town3x);
//             if(town3x%3==0 || numStr.contains("3")){
//                 town3x++;
//                 continue;
//             }
            
//             if(num10==n) break;
                
//             town3x++;
//             num10++;
            
//         }
  
//         return town3x;
        
        // 더 간단하게 풀기
        
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        return answer;
        
    }
}