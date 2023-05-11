import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            if(String.valueOf(i).matches("[^1-46-9]*")){
                list.add(i);
            } 
        }
        
        if(list.isEmpty()){
            list.add(-1);
        }
        
        
        return list.stream().mapToInt(i->i).toArray();
    }
}