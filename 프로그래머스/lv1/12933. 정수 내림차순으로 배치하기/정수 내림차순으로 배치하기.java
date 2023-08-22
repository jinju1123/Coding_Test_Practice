import java.util.*;

class Solution {
    public long solution(long n) {
        
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        
        Arrays.sort(strArr, Collections.reverseOrder());
        
        str = String.join("", strArr);
        
        return Long.parseLong(str);
    }
}