class Solution {
    public String[] solution(String[] quiz) {
        
//         String[] answer = new String[quiz.length];
        
//         for(int i=0; i<quiz.length; i++){
//             String[] str = quiz[i].split(" ");
//             for(int j=0; j<str.length; j++){
//                 if(str[1].equals("+")){
//                     if(Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4])) {
//                         answer[i] = "O";
//                     } else {
//                         answer[i] = "X";
//                     }
//                 } else {
//                     if(Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4])) {
//                         answer[i] = "O";
//                     } else {
//                         answer[i] = "X";
//                     }
//                 }
//             }
//         }
//         return answer;
        
        // 간단하게 풀기!!
        
        for(int i=0; i<quiz.length; i++){ 
            String[] str = quiz[i].split(" ");
            int result = Integer.parseInt(str[0]) + Integer.parseInt(str[2]) 
                            * ( str[1].equals("+") ? 1 : -1 );
            quiz[i] = result == Integer.parseInt(str[4]) ? "O" : "X" ;
        }
        
        return quiz;
    }
}