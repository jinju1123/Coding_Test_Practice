import java.util.*;

class Solution {
    public long solution(long n) {
        
        String str = ""+n;    
        String[] strArr = str.split("");
        
        // 문자열로 된 숫자("1" 이런거)도 정렬하면 숫자 순대로 정렬된다. 이걸 몰랐다!!
        Arrays.sort(strArr, Collections.reverseOrder());
        str = String.join("", strArr);

        return Long.parseLong(str);
    }
}