import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        String[] strArr = new String[arr.length];
        
        for(int i=0; i<strArr.length; i++){
            strArr[i] = String.valueOf(arr[i]);
        }
        
        int startIdx = 0;
        int endIdx = 0;
        
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<strArr.length; i++){
            list.add(strArr[i]);
        }
        
        startIdx = list.indexOf("2");
        endIdx = list.lastIndexOf("2");
        
        List<Integer> listArr = new ArrayList<>();
        
        if(startIdx >= 0) {
        
            for(int i=startIdx; i<=endIdx; i++){
                listArr.add(arr[i]);
            }
        } else {
            listArr.add(-1);
        }
        
        return listArr.stream().mapToInt(i->i).toArray();
    }
}