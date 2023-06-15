import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
       
//         Arrays.sort(strings);  // 사전순 정렬 먼저
        
//         char[] order = new char[strings.length];
        
//         for(int i=0; i<strings.length; i++){
//             order[i] = strings[i].charAt(n); 
//         }
        
//         Arrays.sort(order); // n번째 인덱스로 정렬
        
        
//         // list에 담기
//         ArrayList<String> list = new ArrayList<>();
        
//         for(int i=0; i<order.length; i++){
//             for(int j=0; j<strings.length; j++){
//                 if(order[i]==strings[j].charAt(n)){
            
//                     if(!list.contains(strings[j])){
//                         list.add(strings[j]);
//                     }
                    
//                 }
//             }
//         }        
        
//         return list.toArray(new String[0]);
        
        //  속도는 다소 느리지만 생각이 기발한 코드!
        
        ArrayList<String> list = new ArrayList<>();
        
        
        // n번째 인덱스의 문자와 전체문자열을 더해서 list에 저장한다.
        for(int i=0; i<strings.length; i++){
            list.add(""+strings[i].charAt(n)+strings[i]);
        }
        
        // 통째로 오름차순해버리면 n번째 인덱스 순 + 사전 순으로 해결!
        Collections.sort(list);
        
        // String[]에 n번째 인덱스 문자만 빼고 담기만 하면 끝!
        String[] answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        
        return answer;
        
    }
}