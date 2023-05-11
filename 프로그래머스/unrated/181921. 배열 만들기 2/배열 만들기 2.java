import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            if(i%5==0 && String.valueOf(i).matches("[^1-46-9]*")){
                list.add(i);
            } 
        }
        
        if(list.isEmpty()){
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}