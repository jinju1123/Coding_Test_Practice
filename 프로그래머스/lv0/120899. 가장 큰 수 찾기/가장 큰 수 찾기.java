import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        int max = array[0];
        int a = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > max) {
                max = array[i];
                a = i;
            }
        }
        list.add(max);
        list.add(a);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}