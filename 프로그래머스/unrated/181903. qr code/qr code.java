class Solution {
    public String solution(int q, int r, String code) {
        
        String answer = "";
        
        String[] strArr = new String[(code.length()/q) + 1];
        
        for(int i=0; i<strArr.length; i++){
            int s = i * q; 
            int e = s + q; 
            
            if (e <= code.length()){
                strArr[i] = code.substring(s, e);
            } else {
                strArr[i] = code.substring(s);
            }
        }
        
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].length() > r) {
                answer += strArr[i].charAt(r);
            }
        }
        
        return answer;
    }
}