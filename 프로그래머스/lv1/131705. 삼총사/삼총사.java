class Solution {
    public int solution(int[] number) {
    
        // 임의의 숫자 3개를 뽑아서 더했을 때 0이 되는 경우의 수
        
        int answer = 0;
        
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++) {
                for(int k=j+1; k<number.length; k++) {
                    if(number[i]+number[j]+number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
    
        return answer;
        
    }
}