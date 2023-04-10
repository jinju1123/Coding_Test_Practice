import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String[] arrBefore = before.split("");
        String[] arrAfter = after.split("");
        Arrays.sort(arrBefore);
        Arrays.sort(arrAfter);
        
        return Arrays.equals(arrBefore, arrAfter) ? 1 : 0;
    }
}