import java.util.*;

class Solution {
    public int solution(int a, int b) {
        
        // 최대 공약수 구하기
        int num = 0; //(최대 공약수 넣을 변수)
        int aa = Math.max(a, b);
        int bb = Math.min(a, b);
          while(bb!=0){
		    int r = aa%bb;
		       aa = bb;
		       bb = r;
	        }

        // 기약분수 만들기
        a = a/aa;
        b = b/aa;
        
        // 분모의 소인수를 구해서(소인수분해) list에 담기
        List<Integer> list = new ArrayList<>();
        
        int i = 2;
        while(b>=i){
            if(b%i==0){
                list.add(i);
                b /= i;
            } else {
                i++;
            }
        }
        
        // list에서 2,5 아닌 숫자가 나오면 count하기
        int count = 0;
        for(int j=0; j<list.size(); j++){
            if(list.get(j)!=2 && list.get(j)!=5) {
                count++;
            }
        }
        
        return count==0 ? 1 : 2;
    }
}