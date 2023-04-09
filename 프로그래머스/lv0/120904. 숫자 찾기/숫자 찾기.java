class Solution {
    public int solution(int num, int k) {
        // int answer = -1;
        // String numstr = ""+num;
        // for(int i=0; i<numstr.length(); i++){
        //     if((int)numstr.charAt(i) - '0' == k){
        //         answer = i+1;
        //         break;
        //     }
        // }
        // return answer;
        // indexOf를 이용한 풀이
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        int answer = numStr.indexOf(kStr);
        
        return answer == -1 ? -1 : answer+1;
        
    }
}