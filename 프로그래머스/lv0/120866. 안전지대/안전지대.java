class Solution {
    public int solution(int[][] board) {
        // 너무 어렵다 진짜 ㅡㅡ
        // 먼저 지뢰 찾기
        
        int[][] newBoard = new int[board.length][board[0].length];
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j]==1) {
                    danger(i, j, newBoard);
                }
            }
        }
        
        return countBoard(newBoard);
    }
        
        // 위험지역(지뢰 주변지역)을 전부 1로 만들기
        void danger(int i, int j, int[][] newBoard){

         int overX = newBoard.length;
         int overY = newBoard[0].length;

          newBoard[i][j] = 1;
          if(i > 0) newBoard[i-1][j] =1;       // 왼쪽
          if(i < overX-1) newBoard[i+1][j] =1; // 오른쪽
          if(j < overY-1) newBoard[i][j+1] =1; // 아래쪽
          if(j > 0) newBoard[i][j-1] =1;       // 위쪽
            
          if(i > 0 && j > 0) newBoard[i-1][j-1] =1;             // 왼쪽 위 대각선
          if(i < overX-1 && j > 0) newBoard[i+1][j-1] =1;       // 오른쪽 위 대각선
          if(i > 0 && j < overY-1) newBoard[i-1][j+1] =1;       // 왼쪽 아래 대각선
          if(i < overX-1 && j < overY-1) newBoard[i+1][j+1] =1; // 오른쪽 아래 대각선
            
         }
        
        // 위험 지역이 아닌 곳 세기
        int countBoard(int[][] board) {
            int count = 0;
            
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board.length; j++){
                    if(board[i][j]==0) {
                        count++;
                    }
                }
            }
            
            return count;
        }
        
    
}