class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[strArr.length];
        for(int i=0; i<strArr.length; i++){
            arr[strArr[i].length()] += 1; 
        }
        
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}