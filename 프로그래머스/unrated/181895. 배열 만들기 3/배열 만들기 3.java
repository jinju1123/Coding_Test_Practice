import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        int idxA1 = intervals[0][0];
        int idxA2 = intervals[0][1];
        int idxB1 = intervals[1][0];
        int idxB2 = intervals[1][1];
        for(int i=idxA1; i<=idxA2; i++){
            list.add(arr[i]);
        }
        for(int i=idxB1; i<=idxB2; i++){
            list.add(arr[i]);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}