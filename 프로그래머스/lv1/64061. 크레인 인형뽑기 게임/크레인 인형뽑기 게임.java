import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int k=0; k<moves.length; k++) {
            
            int j = moves[k]-1;
            
            for(int i=0; i<board.length; i++) {
                if(board[i][j] != 0) {
                    if(stack.isEmpty()) {
                        stack.push(board[i][j]);
                        board[i][j] = 0;
                    } else {
                        
                        if(stack.peek() == board[i][j]) {
                            stack.pop();
                            board[i][j] = 0;
                            answer += 2;
                        } else {
                            stack.push(board[i][j]);
                            board[i][j] = 0;
                        }
                    }
                    break;
                }
            }
            
        }
        
        
        return answer;
    }
}