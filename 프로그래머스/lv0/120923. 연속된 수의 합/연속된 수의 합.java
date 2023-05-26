class Solution {
    public int[] solution(int num, int total) {
        
        int[] answer = new int[num];
        int mid = total/num; // 배열의 중간값
        int start = 0;
        
        if(num % 2 != 0) { // num이 홀수면
            start = mid - (num/2);
        } else {           // num이 짝수면
            start = mid - ((num/2)-1);
        }
        
        for(int i=0; i<answer.length; i++, start++){
            answer[i] = start;
        }
        return answer;
        
    }
}