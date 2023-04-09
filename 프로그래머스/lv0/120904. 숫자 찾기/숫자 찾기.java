class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numstr = ""+num;
        for(int i=0; i<numstr.length(); i++){
            if((int)numstr.charAt(i) - '0' == k){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}