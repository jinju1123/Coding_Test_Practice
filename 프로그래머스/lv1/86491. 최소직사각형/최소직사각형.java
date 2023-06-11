class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for(int i=0; i<sizes.length; i++){
           int ww = Math.max(sizes[i][0],sizes[i][1]);
            if(ww > maxW) {
                maxW = ww;
            }
        }
        
        for(int i=0; i<sizes.length; i++){
            int hh = Math.min(sizes[i][0],sizes[i][1]);
            if(hh > maxH) {
                maxH = hh;
            }
        }
        
        return maxW * maxH;
    }
}