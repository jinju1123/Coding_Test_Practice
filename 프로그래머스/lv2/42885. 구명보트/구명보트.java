import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        int answer = 0;
        
        Arrays.sort(people);
        
        int p1 = 0;
        int p2 = people.length-1;
        
        while(p2 >= p1){
            int w = people[p2];
            p2--;
            if(w + people[p1] <= limit){
                p1++;
            }
            answer++;
        }
        
        return answer;

    }
}