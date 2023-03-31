import java.util.*;

class Solution {
     public int solution(String my_string) {
    //     int answer = 0;
    //     my_string = my_string.replaceAll("[^0-9]","");
    //     char[] str = my_string.toCharArray();
    //     for(int i=0; i<str.length; i++){
    //         answer += str[i]-'0';
    //     }
    //     return answer;
    // }
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", "");
        for( char ch : str.toCharArray() ) {
            answer += Character.getNumericValue(ch);
        }
        return answer;
    }
}

