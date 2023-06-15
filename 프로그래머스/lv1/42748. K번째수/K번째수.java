import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
//         ArrayList<Integer> listAnswer = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int i=0; i<commands.length; i++){
            
//             int a = commands[i][0];
//             int b = commands[i][1];
            

//             for(int j=a-1; j<=b-1; j++){
//                 list.add(array[j]);
//             }
            
//             Collections.sort(list);
//             listAnswer.add(list.get(commands[i][2]-1));
//             list.clear();
            
//         }
        
//         return listAnswer.stream().mapToInt(i->i).toArray();
        
        // 나는 왜 배열 복사를 맨날 까먹을까?
        // Arrays.copyOfRange(복사할 배열, 시작 인덱스, 끝 인덱스+1);
        
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        
        return answer;
    }
}