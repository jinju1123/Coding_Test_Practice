import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        if(myString.contains(pat)){
            
            for(int i=0; i<myString.length(); i++){
                if(myString.charAt(i)==pat.charAt(0)){
                    list.add(i);
                }
            }
            
            String str = "";
            
            for(int i=0; i<list.size(); i++){
                int startIdx = list.get(i);
                if(startIdx+pat.length() <= myString.length()){
                    str = myString.substring(startIdx, startIdx+pat.length());
                    if(str.equals(pat)){
                    answer++;
                }
                }
            }
            
        }
        return answer;
    }
}