import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        int[] answer = new int[numlist.length];
        double[] distance = new double[numlist.length];
        
        // 각 요소와 n과의 거리를 구하고 작은 수에는 0.5를 더해서 오름차순 정렬 시 뒤로 가게 설정
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]-n < 0) {
                distance[i] = Math.abs(numlist[i]-n) + 0.5;
            } else {
                distance[i] = Math.abs(numlist[i]-n);
            }
        }
        
        Arrays.sort(distance); // 오름차순 정렬
        
        for(int i=0; i<answer.length; i++){
            // 거리가 소수면(n보다 작은 수이면)
            if(distance[i] % 1 != 0) {
                answer[i] = n-(int)distance[i]; // n에서 거리만큼 빼기
            }
            // 정수면(n보다 큰 수이면)
            else {
                answer[i] = n+(int)distance[i]; // n에서 거리만큼 더하기
            }
        }
        
        return answer;
    }
}