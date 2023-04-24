import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> num = new ArrayList<>();
        for(int i : num_list){
            num.add(i);
        }
        
        int a = num_list.length-1;
        int b = num_list.length-2;
        
        if(num_list[a] > num_list[b]){
            num.add(num_list[a]-num_list[b]);
        } else {
            num.add(num_list[a] * 2);
        }
        
        return num.stream().mapToInt(i->i).toArray();
    }
}