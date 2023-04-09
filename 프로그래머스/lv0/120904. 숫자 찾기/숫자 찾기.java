class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numstr = ""+num;
        for(int i=0; i<numstr.length(); i++){
            if((int)numstr.charAt(i) - 48 == k){
                answer = i+1;
                break;
            } else answer = -1;
        }
        return answer;
    }
}