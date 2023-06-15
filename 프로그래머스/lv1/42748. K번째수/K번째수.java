import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        ArrayList<Integer> listAnswer = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<commands.length; i++){
            
            int a = commands[i][0];
            int b = commands[i][1];
            

            for(int j=a-1; j<=b-1; j++){
                list.add(array[j]);
            }
            
            Collections.sort(list);
            listAnswer.add(list.get(commands[i][2]-1));
            list.clear();
            
        }
        
        return listAnswer.stream().mapToInt(i->i).toArray();
    }
}