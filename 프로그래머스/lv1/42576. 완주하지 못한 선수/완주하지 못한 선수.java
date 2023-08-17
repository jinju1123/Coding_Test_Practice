import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
       
        LinkedList<String> list = new LinkedList<>(Arrays.asList(participant)); 
        
        Collections.sort(list);
        Arrays.sort(completion);
        
        for(int i=0; i<completion.length; i++){
            if(list.get(0).equals(completion[i])){
                list.remove(0);
            } else if(list.get(1).equals(completion[i])) {
                list.remove(1);
            }
        }
        
        
        return list.get(0);
    }
}