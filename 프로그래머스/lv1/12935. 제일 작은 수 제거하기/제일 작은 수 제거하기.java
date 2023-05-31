import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        // 길이가 1이면 -1 담은 배열 출력
        if(arr.length==1){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        // 배열의 삭제를 위한 list를 생성
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        
        // list에 원본 배열 순서 그대로 담고, 가장 작은 수 구하기
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
            if(arr[i]<min){
                min = arr[i];
            }
        }
        
        // 가장 작은 수의 인덱스를 찾아서 변수에 저장
        int idx = list.indexOf(min);
        
        // 해당 인덱스 삭제
        list.remove(idx);
        
        // 배열로 다시 변환
        return list.stream().mapToInt(i->i).toArray();
        
    }
}