import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        // 시간초과 짜증난다 진짜 ㅡㅡ
        
//         List<Character> list = new ArrayList<>();
        
//         int maxIdx = Math.max(X.length(), Y.length());
        
//         int[] idx = new int[maxIdx];
//         Arrays.fill(idx, -1);
        
//         for(int i=0; i<X.length(); i++){
//             for(int j=0; j<Y.length(); j++){
//                 if(X.charAt(i)==Y.charAt(j)) { 
//                     int x = X.charAt(i) - '0';
//                     if(x != idx[j]) {
//                         list.add(X.charAt(i));
//                         idx[j] = X.charAt(i) - '0';
//                         break;
//                     }
//                 }
//             }
//         }
        
        int[] num = new int[10];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<X.length(); i++) {
            num[X.charAt(i) - '0']++;
        }
        
        for(int i=0; i<Y.length(); i++) {
            int y = Y.charAt(i) - '0';
            if(num[y] > 0) {
                list.add(y);
                num[y]--;
            }
        }
        
        // 가장 큰 수 구하기 -> 내림차순하기
        Collections.sort(list, Collections.reverseOrder());
        
        // list가 비어있으면 짝궁 숫자가 없으므로 "-1" 반환
        if(list.isEmpty()) return "-1";
        
        // 구성 값이 모두 "0"인지 확인
        int temp = 0;
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i) != 0) {
                temp++;
                break;
            }
        }
        
        if(temp==0) return "0";
        
        // sb에 붙여서 문자 만들기
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<list.size(); i++) {
            sb.append(list.get(i));
        }
        
        return sb.toString();
    }
}