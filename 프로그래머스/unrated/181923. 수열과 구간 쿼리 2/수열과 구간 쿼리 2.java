import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>(); 
        
        for(int i=0; i<queries.length; i++){
            
            int min = 1000000;
            int ans = -1;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=s; j<=e; j++){
                if(arr[j]>k){
                    if(arr[j]<min){
                        min = arr[j];
                        ans = min;
                    }
                }
            }
            
            list.add(ans);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
