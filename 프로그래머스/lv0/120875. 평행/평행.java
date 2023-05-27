import java.util.*;

class Solution {
public int solution(int[][] dots) {
    
        // 평행하다 == 기울기가 같다.
        // 기울기 구하는 공식 == y값의 증가량 / x값의 증가량
        // 점 4개로(a,b,c,d) 나올수 있는 평행선 3가지 : [a-b, c-d], [a-c, b-d], [a-d, b-c]
        // a=0 b=1 c=2 d=3
    
        int answer = 0;
        
        double a1 = (double)(dots[0][1]-dots[1][1])/(dots[0][0]-dots[1][0]);
        double a2 = (double)(dots[2][1]-dots[3][1])/(dots[2][0]-dots[3][0]);
    
        double b1 = (double)(dots[0][1]-dots[2][1])/(dots[0][0]-dots[2][0]);
        double b2 = (double)(dots[1][1]-dots[3][1])/(dots[1][0]-dots[3][0]);
    
        double c1 = (double)(dots[0][1]-dots[3][1])/(dots[0][0]-dots[3][0]);
        double c2 = (double)(dots[1][1]-dots[2][1])/(dots[1][0]-dots[2][0]);
    
        if(a1 == a2 || b1 == b2 || c1 == c2) {
            answer = 1;
        }
        
        return answer;
 
    }
}