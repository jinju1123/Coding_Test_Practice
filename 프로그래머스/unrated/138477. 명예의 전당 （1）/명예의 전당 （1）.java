import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        int[] answer = new int[score.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(k < score.length) {
            for(int i=0; i<k; i++){
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
            }

            for(int i=k; i<score.length; i++){
                if(score[i]>list.get(0)){
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                    answer[i] = list.get(0);
                } else {
                    answer[i] = list.get(0);
                }
            }
        } else {
            for(int i=0; i<score.length; i++){
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
            }
        }

        
        return answer;
    }
}