class Solution {
    public int[][] solution(int n) {
        
        int[][] answer = new int[n][n]; 
        int val = 1; // 채울 값
        int row = 0; // 행 길이
        int col = 0; // 열 길이
        int position = 0; // 위치
        
        while(val <= n*n) { // 값이 다 채워지면 종료
            
            answer[row][col] = val++;
            
            if(position == 0) {  // 오른쪽으로 이동
                if(col == n-1 || answer[row][col+1] != 0) {
                    position = 1;
                    row++;
                } else {
                    col++;
                }
            } else if(position == 1) { // 아래쪽으로 이동
                if(row == n-1 || answer[row+1][col] != 0) {
                    position = 2;
                    col--;
                } else {
                    row++;   
                }
            } else if(position == 2) { // 왼쪽으로 이동
                if(col == 0 || answer[row][col-1] != 0) {
                    position = 3;
                    row--;
                } else {
                    col--;
                }
            } else if(position == 3) { // 위쪽으로 이동
                if(row == 0 || answer[row-1][col] != 0) {
                    position = 0;
                    col++;
                } else {
                    row--;
                }
            }

        }        
        return answer;
    }
}