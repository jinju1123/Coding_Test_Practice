class Solution {
    public int[] solution(String my_string) {
        // int[] answer = new int[52];
        // char[] alph = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        //                  'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        //                 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        //                  'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        // for(int i=0; i<my_string.length(); i++){
        //     for(int j=0; j<alph.length; j++){
        //         if(my_string.charAt(i) == alph[j]){
        //             answer[j]++;
        //         }
        //     }
        // }
        // return answer;
        
        // char 이용해서 간단하게 풀기. 무식하게 풀지 말구
        
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 'a')
                answer[c - 'a' + 26]++;
            else
                answer[c - 'A']++;
        }
        return answer;
    }
}