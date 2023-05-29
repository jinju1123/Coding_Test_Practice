class Solution {
    public int solution(int num) {
     
        int answer = 0;
        long n = num;
        
        if(n==1) return 0;
        
        while(true) {
            answer++;
            if(n%2==0) {
                n /= 2;
            } else {
                // int num을 long n으로 바꾼 이유는
                // 바로 아래 식을 수행할 때 값이 int 범위를 벗어나면서
                // 오버플로우가 발생하여 값 손실이 일어날 수 있기 때문이다.
                // 정확한 연산을 하려면 long 타입으로 바꾼 뒤 연산하자.
                n = (n*3)+1;
            }
            if(n==1) break;
        }
        
        if(answer >= 500) {
            answer = -1;
        }
        
        return answer;
        
        
    }
}