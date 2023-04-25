import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strArr) {
        // List<String> list = new ArrayList<>(Arrays.asList(strArr));
        // for(int i=0; i<strArr.length; i++){
        //     if(strArr[i].contains("ad"))
        //         list.remove(String.valueOf(strArr[i]));
        // }
        // return list.toArray(new String[0]);
        
        // Collectors.toList를 통해 stream을 list로 만들어주기!
        List<String> list = Arrays.stream(strArr).filter(s->!s.contains("ad")).collect(Collectors.toList());
        return list.toArray(new String[0]);
    }
}