import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=k; i<=n; i+=k){
            arr.add(i);
        }
        
        int[] answer = arr.stream().mapToInt(i->i).toArray();
        return answer;
    }
}