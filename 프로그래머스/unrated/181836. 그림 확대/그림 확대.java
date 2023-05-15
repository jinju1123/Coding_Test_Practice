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
    }
}