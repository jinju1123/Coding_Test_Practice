class Solution {
    public String solution(String polynomial) {
        
        String answer = "";
        int num = 0;
        int numX = 0;
        
        String[] strArr = polynomial.split(" ");
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("x") && !strArr[i].equals("+")) {
                num += Integer.parseInt(strArr[i]);
            } else if(strArr[i].contains("x")){
                if(strArr[i].length() == 1){
                    numX++;
                } else {
                    String ss = strArr[i].substring(0, strArr[i].length()-1);
                    numX += Integer.parseInt(ss);
                }
            }
        }
        
        if(numX == 1) {
            if(num != 0) {
                answer = "x + " + num;
            } else {
                answer = "x";
            }
        } else if(numX != 0){
            if(num != 0) {
            answer = numX + "x + " + num;
            } else {
                answer = numX + "x";
            }
        } else {
            answer = ""+num;
        }
        
        
        return answer;
    }
}