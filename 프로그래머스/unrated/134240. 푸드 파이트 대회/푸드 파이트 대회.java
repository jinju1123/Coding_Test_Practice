class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            int cnt = food[i]/2;
            for(int j=1; j<=cnt; j++){
                answer += String.valueOf(i);
            }
        }
        
        StringBuilder sb = new StringBuilder(answer);
        sb.reverse();
        
        answer = answer + "0" + sb.toString();
        
        
        return answer;
    }
}