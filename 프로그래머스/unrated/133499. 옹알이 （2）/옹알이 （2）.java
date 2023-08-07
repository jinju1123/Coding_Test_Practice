import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replace("aya","1");
            babbling[i] = babbling[i].replace("ye","2");
            babbling[i] = babbling[i].replace("woo","3");
            babbling[i] = babbling[i].replace("ma","4");
            
            if(!babbling[i].contains("11")
               && !babbling[i].contains("22")
               && !babbling[i].contains("33")
               && !babbling[i].contains("44")) {
                babbling[i] = babbling[i].replace("1","");
                babbling[i] = babbling[i].replace("2","");
                babbling[i] = babbling[i].replace("3","");
                babbling[i] = babbling[i].replace("4","");
            }
            
            if(babbling[i].isEmpty()) answer++;
        } 
        
        return answer;
    }
}