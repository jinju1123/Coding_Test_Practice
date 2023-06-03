class Solution {
    public boolean solution(String s) {
        String s1 = "";
        
        if(s.length() == 4 || s.length() == 6){
            s1 = s.replaceAll("[a-zA-Z]", "");
        } else {
            return false;
        }
        return s.length() == s1.length() ? true : false;
    }
}