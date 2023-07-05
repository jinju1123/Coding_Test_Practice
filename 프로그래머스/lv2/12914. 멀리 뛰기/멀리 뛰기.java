class Solution {
    public long solution(int n) {
        long[] nArr = new long[2001];
        
        nArr[1] = 1L;
        nArr[2] = 2L;
        
        for(int i=3; i<nArr.length; i++){
            nArr[i] = (nArr[i-1]+nArr[i-2]) % 1234567;
        }
        
        return nArr[n];
        
        // 피보나치 수열은 몇 번 풀어서 익숙하지만,
        // 이 문제가 피보나치 수열로 풀어야한다는 사실을 깨닫는게 매우 어렵다.
        // 식을 아무리 많이 알고 있어도 적용해야 할 때를 모르면 말짱 도루묵
        // <<어떤 방법>>으로 문제를 풀어야 하는가. 알아야 하는게 핵심 포인트!!!!
    }
}