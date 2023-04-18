import java.util.HashSet;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=2; i<=n; i++){
            while(n % i == 0){
                set.add(i);
                n /= i;
            }
        }
        if(n != 1) set.add(n);
        
        // set을 int[]로 바꾸는 stream인데... 그냥 외우자
        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}