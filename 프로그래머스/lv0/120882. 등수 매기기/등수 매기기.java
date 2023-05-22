import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        
//         double[] avgArr = new double[score.length];
        
//         // 평균 구해서 배열에 넣기
//         for(int i=0; i<score.length; i++){
//             double avg = (double)(score[i][0] + score[i][1]) / 2;
//             avgArr[i] = avg;
//         }
        
//         // 순위 구하는 배열 만들기
//         int[] answer = new int[avgArr.length];
        
//         for(int i=0; i<answer.length; i++){
//             answer[i] = 1;
//             for(int j=0; j<answer.length; j++) {
//                 if(avgArr[i] < avgArr[j]) {
//                     answer[i] += 1;  // 나보다 큰 값이 있으면 1씩 올리기! 그게 내 순위
//                 }
//             }
//         }
//         return answer;
        
        // 깔끔한 코드 발견! list와 list.sort() 이용하기
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            list.add((score[i][0]+score[i][1]));
        }
        
        list.sort(Comparator.reverseOrder()); // 내림차순으로 정렬
        
        int[] answer = new int[score.length]; // 순서 담을 int배열
        for(int j=0; j<answer.length; j++){
            answer[j] = list.indexOf(score[j][0]+score[j][1])+1; 
            // indexOf 하면 가장 앞에 인덱스가 나오기 때문에 공동 등수 문제해결
        }
        
        return answer;
        
    }
}