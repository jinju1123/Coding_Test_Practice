class Solution {
    public boolean solution(int x) {
        
        int sum = 0;
        
        String s = String.valueOf(x);
        
        for(char c : s.toCharArray()) {
            sum += c - '0';
        }
        
        return x % sum == 0 ? true : false;
    }
}