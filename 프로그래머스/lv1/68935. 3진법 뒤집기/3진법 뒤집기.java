class Solution {
    public int solution(int n) {
        
        // 10진법 -> 3진법
        String nStr = Integer.toString(n,3);
        
        StringBuilder sb = new StringBuilder(nStr);
        String ss = sb.reverse().toString();
       
        // 3진법 -> 10진법
        return Integer.parseInt(ss, 3);
    }
}