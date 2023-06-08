class Solution {
    public String solution(String s) {
        
        String answer = "";
        
        String start = s.stripLeading();
        int startnum = s.length() - start.length();
        
        String end = s.stripTrailing();
        int endnum = s.length() - end.length();
        
        String[] strArr = s.trim().split(" ");
        
        for(int i=0; i<strArr.length; i++){
            for(int j=0; j<strArr[i].length(); j++){
                if(j%2==0) {
                    answer += String.valueOf(strArr[i].charAt(j)).toUpperCase();
                } else {
                    answer += String.valueOf(strArr[i].charAt(j)).toLowerCase();
                }
            }
            if(i!=strArr.length-1){
                answer += " ";
            }
        }
        
        for(int i=0; i<startnum; i++){
            answer = " " + answer;
        }
        
        for(int i=0; i<endnum; i++){
            answer += " ";
        }
        
        return answer;
    }
}