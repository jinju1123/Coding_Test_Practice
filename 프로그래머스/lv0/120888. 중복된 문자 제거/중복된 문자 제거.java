import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<String> str = new ArrayList<String>();
        for(int i=0; i<my_string.length(); i++){
            if(!str.contains(String.valueOf(my_string.charAt(i)))) {
                str.add(String.valueOf(my_string.charAt(i)));
            }
        }
        return String.join("", str);
    }
}