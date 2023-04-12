import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] array, int n) {
        int min = 100;
        for(int i=0; i<array.length; i++){
            if(Math.abs(array[i]-n) < min){
                min = Math.abs(array[i]-n);
            }
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            if(Math.abs(array[i]-n) == min){
                arr.add(array[i]);
            }
        }
        Collections.sort(arr);
        
        return arr.get(0);
    }
}