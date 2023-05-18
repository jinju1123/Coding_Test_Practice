import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int[] answer = new int[2];
        
        int p = (denom1*denom2);
        int c = (numer1*denom2) + (numer2*denom1);

        
        // 최대 공약수 구하기
        int num = 0; //(최대 공약수 넣을 변수)
        int a = Math.max(p, c);
        int b = Math.min(p, c);
          while(b!=0){
		    int r = a%b;
		       a = b;
		       b = r;
	        }
            num = a;
        
        answer[0] = c/num;
        answer[1] = p/num;
       
        return answer;
    }
}