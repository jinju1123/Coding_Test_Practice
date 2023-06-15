import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
//         List<Integer> list = new ArrayList<>();
        
//         for(int i=0; i<numbers.length; i++){
//             for(int j=i+1; j<numbers.length; j++){
//                 int sum = numbers[i]+numbers[j];
//                 if(!list.contains(sum)){
//                     list.add(sum);
//                 }
//             }
//         }
        
//         return list.stream().sorted().mapToInt(i->i).toArray();
        
        // 속도 차이가 얼마나 나려나? hashset이랑 친해지기
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
        
    }
}