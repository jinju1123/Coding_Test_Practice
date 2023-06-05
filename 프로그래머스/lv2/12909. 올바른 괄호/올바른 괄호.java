import java.util.*;

class Solution {
    boolean solution(String s) {
        
        // 스택 문제 처음 풀어본당!! 어렵다
        boolean answer = true;
        
        // '('를 넣을거라 Character로 설정
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '(') {
                stack.push(c);
            } else {
                // 시작부터 닫는 괄호가 나오는 경우, 닫는 괄호 ')' 가 더 많은 경우
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        
        // 비어있지 않다는 건 여는 괄호가 더 많은 경우
        if(!stack.isEmpty()){
            return false;
        }
        
        return answer;
    }
}