import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        for(int i=0; i<picture.length; i++){
           String[] str = picture[i].split("");
            for(int j=0; j<str.length; j++){
                str[j] = str[j].repeat(k);
            }
           picture[i] = String.join("", str);
        }
        
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<picture.length; i++){
            for(int j=1; j<=k; j++){
               list.add(picture[i]);
            }
        }
        
        return list.toArray(new String[0]);
        
//         // 이 방법도 깔끔하다. StringBuilder를 사용한 것. 나는 얘가 너무 안익숙하다

//         String[] answer = new String[picture.length * k];
//         int idx = 0;

//         for(int i=0; i<picture.length; i++) {
//             for(int j=0; j<k; j++) {
//                 StringBuilder sb = new StringBuilder();

//                 for(int l=0; l<picture[i].length(); l++) {
//                     sb.append(String.valueOf(picture[i].charAt(l)).repeat(k));
//                 }

//                 answer[idx++] = sb.toString();
//             }
//         }

//         return answer;

    }
}