import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> hashArr = new LinkedHashSet<Integer>(); 
        
        for(int j=0; j<arr.length; j++){
                hashArr.add(arr[j]);
        }
        
        List<Integer> list = new ArrayList<>(hashArr);
        
        if(list.size() > k) {
            int roop = list.size()-k;
            for(int i=0; i<roop; i++){
                list.remove(list.size()-1);
            }
        } else if(list.size() <= k) {
            int roop = k-list.size();
            for(int i=0; i<roop; i++){
                list.add(-1);
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}