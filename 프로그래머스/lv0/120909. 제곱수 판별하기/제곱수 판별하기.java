import java.util.*;
class Solution {
    public int solution(int n) {
        List<Integer> divi = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                divi.add(i);
            }
        }
        
        if(divi.size() % 2 == 0){
            return 2;
        }
        return 1 ;
    }
}