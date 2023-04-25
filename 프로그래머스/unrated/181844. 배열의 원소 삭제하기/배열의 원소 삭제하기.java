import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // arr배열과 같은 list 생성
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        
        // 중복값 찾기
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    list.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}