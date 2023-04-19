class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] strArr = new String[array.length];
        for(int i=0; i<array.length; i++){
            strArr[i] = String.valueOf(array[i]);
        }
        
        String str = String.join("", strArr);
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '7'){
                answer++;
            }
        }
        return answer;
    }
}