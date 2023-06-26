class Solution {
    public int[] solution(int brown, int yellow) {
        
        int[] answer = new int[2];
        
        int num = brown+yellow;
        
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                int width = num/i;
                if(yellow % (width-2) == 0) {
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }
        
        return answer;
    }
}