class Solution {
    public int[] solution(int n, String[] words) {

        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        
        int[] answer = new int[2];
        
        for(int i=0; i<words.length-1; i++){
            if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)){
                idx1 = i+1;
                break;
            }
        }
        
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                if(words[i].equals(words[j])) {
                    idx2 = j;
                    break;
                }
            }
        }
        
        if(idx1>0 && idx2>0) {
            idx = Math.min(idx1, idx2);
        } else {
            idx = Math.max(idx1, idx2);
        }
        
        if(idx==0){
            return answer;
        } else {
            if((idx+1)%n==0) {
                answer[0] = n;
                answer[1] = (idx+1)/n;
            } else {
                answer[0] = (idx+1)%n;
                answer[1] = (idx+1)/n + 1;
            }
           
        }
        
        return answer;
    }
}