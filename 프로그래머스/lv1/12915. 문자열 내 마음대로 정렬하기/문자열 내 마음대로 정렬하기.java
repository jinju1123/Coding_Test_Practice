import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
       
        Arrays.sort(strings);
        
        char[] order = new char[strings.length];
        
        for(int i=0; i<strings.length; i++){
            order[i] = strings[i].charAt(n);
        }
        
        Arrays.sort(order);
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<order.length; i++){
            for(int j=0; j<strings.length; j++){
                if(order[i]==strings[j].charAt(n)){
            
                    if(!list.contains(strings[j])){
                        list.add(strings[j]);
                    }
                    
                }
            }
        }        
        
        return list.toArray(new String[0]);
    }
}