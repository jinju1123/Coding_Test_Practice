class Solution {
    public int solution(String s) {
        String[] numArr = {"zero","one","two","three","four",
                           "five","six","seven","eight","nine",};
        
        String[] str = s.split("");
        
        boolean check = true;
        
        String answer = "";
        String nNum = "";
        String sNum = "";
        
        for(int i=0; i<str.length; i++){
            
            if(str[i].matches("[0-9]")){
                nNum = str[i];
            } else {
                check = false;
                sNum += str[i];
                for(int j=0; j<numArr.length; j++){
                    if(sNum.equals(numArr[j])){
                        check = true;
                        nNum = String.valueOf(j);
                        sNum = "";
                    }
                }
            }
            
            if(check) {
                answer += nNum;
            }
        }
          
        
        return Integer.parseInt(answer);
    }
}