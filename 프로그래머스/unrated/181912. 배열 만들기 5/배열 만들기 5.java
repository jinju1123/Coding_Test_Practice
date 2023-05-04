import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        String str = "";
        for(String ss : intStrs){
            str = ss.substring(s, s+l);
            if(Integer.parseInt(str) > k) {
                list.add(Integer.parseInt(str));
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}