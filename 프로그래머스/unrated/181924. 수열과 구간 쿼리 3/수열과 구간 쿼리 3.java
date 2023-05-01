class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int x = 0;
        for(int a=0; a<queries.length; a++){
            x = arr[queries[a][0]];
            arr[queries[a][0]] = arr[queries[a][1]];
            arr[queries[a][1]] = x;
        }
        return arr;
    }
}