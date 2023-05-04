import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        List<Integer> list = new ArrayList<>();
        for(String s : str){
            list.add(s.length());
        }
        if(myString.charAt(myString.length()-1) == 'x'){
            list.add(0);
        }
        
        // int[] answer = new int[list.size()];
        // for(int i=0; i<answer.length; i++){
        //     answer[i] = list.get(i);
        // }
        return list.stream().mapToInt(i->i).toArray();
    }
}