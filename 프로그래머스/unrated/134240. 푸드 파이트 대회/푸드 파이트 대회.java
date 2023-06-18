class Solution {
    public String solution(int[] food) {
//         String answer = "";
        
//         for(int i=1; i<food.length; i++){
//             int cnt = food[i]/2;
//             for(int j=1; j<=cnt; j++){
//                 answer += String.valueOf(i);
//             }
//         }
        
//         StringBuilder sb = new StringBuilder(answer);
//         sb.reverse();
        
//         answer = answer + "0" + sb.toString();
        
        
//         return answer;
        
        // 속도가 좀 느린거 같아서 StringBuilder와 repeat() 함수 쓰기
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            int cnt = food[i]/2;
            sb.append(String.valueOf(i).repeat(cnt));
        }
        
        String answer = sb + "0";
        
        return answer + sb.reverse();
            
    }
}