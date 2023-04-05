import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                arr.add(numlist[i]);
            }
        }
        
        //int[] answer = new int[arr.size()];
        //for(int i=0; i<arr.size(); i++){
        //    answer[i] = arr.get(i);
        //}
        
        // 스트림으로도 가능한데 ... 스트림 도대체 뭘까
        int[] answer = arr.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}