import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
//         int[] answer = new int[score.length];
        
//         ArrayList<Integer> list = new ArrayList<>();
        
//         if(k < score.length) {
//             for(int i=0; i<k; i++){
//                 list.add(score[i]);
//                 Collections.sort(list);
//                 answer[i] = list.get(0);
//             }

//             for(int i=k; i<score.length; i++){
//                 if(score[i]>list.get(0)){
//                     list.remove(0);
//                     list.add(score[i]);
//                     Collections.sort(list);
//                     answer[i] = list.get(0);
//                 } else {
//                     answer[i] = list.get(0);
//                 }
//             }
//         } else {
//             for(int i=0; i<score.length; i++){
//                 list.add(score[i]);
//                 Collections.sort(list);
//                 answer[i] = list.get(0);
//             }
//         }

//         return answer;
        
        // 우선순위 큐로 풀기
        int[] answer = new int[score.length];
        
        // 기본 오름차순으로 우선순위 정렬 
        // (1, 10, 5) -> (1, 5, 10)으로 가장 낮은 숫자인 1이 우선순위가 제일 높음
        // 반대로 하고 싶으면 
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<score.length; i++){
            
            pq.add(score[i]);
            if(pq.size() > k) {
                pq.remove();  // 우선순위가 가장 높은 값(첫번째) 삭제
            }
            
            answer[i] = pq.peek(); // 우선순위가 가장 높은 값(첫번째) 가져오기
        }
        
        return answer;
        
    }
}