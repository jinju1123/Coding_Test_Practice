class Solution {
    public int[][] solution(int[][] arr) {
        
//         if(arr.length > arr[0].length) {
            
//             int[][] newArr = new int[arr.length][arr.length];
            
//             for(int i=0; i<arr.length; i++) {
//                 for(int j=0; j<arr[0].length; j++) {
//                     newArr[i][j] = arr[i][j];
//                 }
//             }
            
//             for(int i=0; i<newArr.length; i++){
//                 for(int j=arr[0].length; j<arr.length; j++){
//                     newArr[i][j] = 0;
//                 }
//             }
    
//             return newArr;
            
//         } else if (arr.length < arr[0].length) {
            
//              int[][] newArr = new int[arr[0].length][arr[0].length];
            
//              for(int i=0; i<arr.length; i++) {
//                 for(int j=0; j<arr[0].length; j++) {
//                     newArr[i][j] = arr[i][j];
//                 }
//              }
            
//             for(int i=arr.length; i<arr[0].length; i++){
//                 for(int j=0; j<newArr.length; j++){
//                     newArr[i][j] = 0;
//                 }
//             }
            
//             return newArr;
//         }

//         return arr;
        
        // 또 혼자 겁나 복잡하게 풀었네.. max쓰면 간단히 해결^^ 휴 공부해라
        int max = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
        
    }
}