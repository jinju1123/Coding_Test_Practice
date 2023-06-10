class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        String str = Integer.toBinaryString(n);
        
        int nlen = 0;
        for(char c : str.toCharArray()){
            if(c=='1') nlen++;
        }
        
        while(true) {
            n++;
            String num = Integer.toBinaryString(n);
            int numlen = 0;
            for(char c : num.toCharArray()){
                if(c=='1') numlen++;
            }
            if(nlen==numlen) break;
        }
        
        return n;
    }
}