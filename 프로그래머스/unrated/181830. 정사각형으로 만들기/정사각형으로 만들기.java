class Solution {
    public int[][] solution(int[][] arr) {
        
        if(arr.length > arr[0].length) {
            
            int[][] newArr = new int[arr.length][arr.length];
            
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[0].length; j++) {
                    newArr[i][j] = arr[i][j];
                }
            }
            
            for(int i=0; i<newArr.length; i++){
                for(int j=arr[0].length; j<arr.length; j++){
                    newArr[i][j] = 0;
                }
            }
    
            return newArr;
            
        } else if (arr.length < arr[0].length) {
            
             int[][] newArr = new int[arr[0].length][arr[0].length];
            
             for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[0].length; j++) {
                    newArr[i][j] = arr[i][j];
                }
             }
            
            for(int i=arr.length; i<arr[0].length; i++){
                for(int j=0; j<newArr.length; j++){
                    newArr[i][j] = 0;
                }
            }
            
            return newArr;
        }

        return arr;
        
    }
}