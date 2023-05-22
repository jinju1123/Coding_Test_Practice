class Solution {
    public int[] solution(int[][] score) {
        
        double[] avgArr = new double[score.length];
        
        // 평균 구해서 배열에 넣기
        for(int i=0; i<score.length; i++){
            double avg = (double)(score[i][0] + score[i][1]) / 2;
            avgArr[i] = avg;
        }
        
        // 순위 구하는 배열 만들기
        int[] answer = new int[avgArr.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = 1;
            for(int j=0; j<answer.length; j++) {
                if(avgArr[i] < avgArr[j]) {
                    answer[i] += 1;  // 나보다 큰 값이 있으면 1씩 올리기! 그게 내 순위
                }
            }
        }
        return answer;
    }
}