import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
           int n = arr[i];
            for(int j=0; j<n; j++){
                list.add(n);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}