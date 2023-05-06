import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
//         int answer = 0;
//         List<Integer> list = new ArrayList<>();
//         if(myString.contains(pat)){
            
//             for(int i=0; i<myString.length(); i++){
//                 if(myString.charAt(i)==pat.charAt(0)){
//                     list.add(i);
//                 }
//             }
            
//             String str = "";
            
//             for(int i=0; i<list.size(); i++){
//                 int startIdx = list.get(i);
//                 if(startIdx+pat.length() <= myString.length()){
//                     str = myString.substring(startIdx, startIdx+pat.length());
//                     if(str.equals(pat)){
//                     answer++;
//                 }
//                 }
//             }
            
//         }
//         return answer;
        // 다른 사람들 풀이보고 또 현타가 온다.. 나처럼 복잡하게 생각하는 사람이 없구나 하
        // 1번 방식 - 앞에부터 차례로 잘라서 시작이 pat으로 하면 cnt 증가하게.. 젤 간단한듯
        // int cnt = 0;
        // for(int i=0; i<myString.length(); i++){
        //     if(myString.substring(i).startsWith(pat)) cnt++;
        // }
        // return cnt;
        
        //2번 방식 - (전체문자열-부분문자열) 하는 이유는 
        //부분문자열 길이 때문에 그 뒤에 인덱스는 어차피 for문 돌릴 필요없으니까!!
        int cnt = 0;
        for(int i=0; i<=myString.length()-pat.length(); i++){
            if(myString.substring(i, i+pat.length()).equals(pat)) cnt++;
        }
        return cnt ;
    }
}