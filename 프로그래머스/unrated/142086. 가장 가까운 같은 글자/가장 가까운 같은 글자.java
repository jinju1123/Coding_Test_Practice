class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        String[] strArr = s.split("");
        
        for(int i=1; i<strArr.length; i++){
            for(int j=i-1; j>=0; j--) {
                if(strArr[i].equals(strArr[j])){
                    answer[i] = i-j;
                    break;
                } else {
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}