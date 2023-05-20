class Solution {
    public int solution(int[][] dots) {
        
        int width = 0;
        int height = 0;
        
        if(dots[0][0] != dots[1][0]) {
            width = Math.abs(dots[0][0]-dots[1][0]);
        } else {
            width = Math.abs(dots[0][0]-dots[2][0]);
        }
        
        if(dots[0][1] != dots[1][1]) {
            height = Math.abs(dots[0][1]-dots[1][1]);
        } else {
            height = Math.abs(dots[0][1]-dots[2][1]);
        }
        
        return width * height;
    }
}