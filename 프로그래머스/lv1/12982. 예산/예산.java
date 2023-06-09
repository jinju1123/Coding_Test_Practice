import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        int answer = 0;
        
        Arrays.sort(d);
        
        // 최대 많은 부서의 물품을 구매하려면
        // 금액이 적은 부서의 물품을 구매해야한다.
        // 그래서 정렬 후 예산에서 차례대로 빼주면 끝!
        for(int i=0; i<d.length; i++){
           budget -= d[i];
            if(budget < 0) break;
            answer++;
        }
        
        return answer;
    }
}