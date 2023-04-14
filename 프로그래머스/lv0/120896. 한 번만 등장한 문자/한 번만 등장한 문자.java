import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 알파벳 크기의 int 배열을 만든다. 0으로 초기화됨.
        int[] num = new int[26];
        
        // 각 알파벳 순서에 맞는 인덱스 값을 중복이 될때 마다 1씩 올라가도록 설정
        for(int i=0; i<s.length(); i++){
            num[s.charAt(i)-97]++; 
        }
        
        // 인덱스 값이 1이면 한번만 등장한 문자라는 뜻이므로 그 값을 answer에 저장 
        for(int i=0; i<26; i++){
            if(num[i] == 1) {
                answer += (char)(i+97);
            }
        }
        return answer;
    }
}