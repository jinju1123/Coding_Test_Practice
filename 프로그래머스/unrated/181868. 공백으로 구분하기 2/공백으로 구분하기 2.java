import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.removeAll(Arrays.asList(""));
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}