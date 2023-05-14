import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int a = Math.max(sides[0], sides[1]);
        int b = Math.min(sides[0], sides[1]);
        
        for(int i=a; i>a-b; i--){
            answer++;
        }
        
        for(int i=a+1; i<a+b; i++){
            answer++;
        }
        
        return answer;
    }
}