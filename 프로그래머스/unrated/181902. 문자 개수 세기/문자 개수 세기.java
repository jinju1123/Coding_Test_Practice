class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] alph = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                         'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                         'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<alph.length; j++){
                if(my_string.charAt(i) == alph[j]){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}