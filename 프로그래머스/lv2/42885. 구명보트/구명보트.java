import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
//         int answer = 0;
        
//         Arrays.sort(people);
        
//         int p1 = 0;
//         int p2 = people.length-1;
        
//         while(p2 >= p1){
//             int w = people[p2];
//             p2--;
//             if(w + people[p1] <= limit){
//                 p1++;
//             }
//             answer++;
//         }
        
//         return answer;
        
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        for (; i < j; --j) {
            if (people[i] + people[j] <= limit)
                ++i;
        }
        
        // 한 명씩 태우는 경우의 수 - 두 명씩 태우는 경우의 수
        return people.length - i; 

    }
}