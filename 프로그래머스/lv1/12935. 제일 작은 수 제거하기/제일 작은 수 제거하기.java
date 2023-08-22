import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1) {
            int[] a = {-1};
            return a;
        }
        
        int[] sortArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortArr);
        int min = sortArr[0];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        
        list.remove(Integer.valueOf(min));
        
        return list.stream().mapToInt(i->i).toArray();
    }
}