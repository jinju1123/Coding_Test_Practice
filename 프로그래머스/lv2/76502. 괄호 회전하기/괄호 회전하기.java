import java.util.*;

class Solution {
    public int solution(String s) {
        
        int answer = 0;
        
        if(correct(s)){
            answer++;
        }

        for(int i=1; i<s.length(); i++){
            s = leftS(s);
            if(correct(s)){
                answer++;
            }
        }
        
        return answer;
    }
    
    // 왼쪽으로 움직이는 메소드
    public static String leftS(String s) {
        return s.substring(1) + s.charAt(0);
    }
    
    // 괄호가 올바른지 확인하는 메소드
    public static boolean correct(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(!stack.isEmpty()) {
                    switch(c){
                        case(')') : 
                            if(stack.peek()=='(') stack.pop();
                            break;
                        case(']') : 
                            if(stack.peek()=='[') stack.pop();
                            break;
                        case('}') : 
                            if(stack.peek()=='{') stack.pop();
                            break;
                    }
                } else {
                    stack.push(c);
                }
            }
        }
        
        return stack.isEmpty();
    }
}