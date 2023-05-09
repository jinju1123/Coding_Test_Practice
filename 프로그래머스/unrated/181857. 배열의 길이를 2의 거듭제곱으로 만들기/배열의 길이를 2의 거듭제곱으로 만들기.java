import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        
        int temp = 1;
        Integer arrLen = arr.length;
        
        while(true) {
            if(arrLen.compareTo(temp) == -1){
                for(int i=0; i<temp-arr.length; i++){
                    list.add(0);
                }
                break;
            }
            
            if (arrLen.compareTo(temp) == 0) break;
            
            temp *= 2;
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}