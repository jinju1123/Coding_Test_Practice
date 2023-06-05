import java.util.*;

class Solution {
    boolean solution(String s) {
        
//         // 스택 문제 처음 풀어본당!! 어렵다
//         boolean answer = true;
        
//         // '('를 넣을거라 Character로 설정
//         Stack<Character> stack = new Stack<>();
        
//         for(char c : s.toCharArray()){
//             if(c == '(') {
//                 stack.push(c);
//             } else {
//                 // 시작부터 닫는 괄호가 나오는 경우, 닫는 괄호 ')' 가 더 많은 경우
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 stack.pop();
//             }
//         }
        
//         // 비어있지 않다는 건 여는 괄호가 더 많은 경우
//         if(!stack.isEmpty()){
//             return false;
//         }
        
//         return answer;
        
        // 스택을 안쓰고 사용하는 풀이!
        // 원리는 스택 풀이와 동일하다. 이 원리를 기억하고 있어야겠다!!

        boolean answer = false;
        int count = 0;
        
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            
            // 포인트는 여기다. 0보다 작아졌다는건 닫는 괄호가 더 많다는 것
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
        
    }
}