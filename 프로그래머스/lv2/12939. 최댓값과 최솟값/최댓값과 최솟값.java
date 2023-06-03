class Solution {
    public String solution(String s) {
        
        String[] str = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        // 최대값
        for(int i=0; i<str.length; i++){
            if(Integer.parseInt(str[i])>max){
                max = Integer.parseInt(str[i]);
            }
        }
        
        // 최솟값
         for(int i=0; i<str.length; i++){
            if(Integer.parseInt(str[i])<min){
                min = Integer.parseInt(str[i]);
            }
        }
        
//          StringBuilder sb = new StringBuilder();
        
//          sb.append(String.valueOf(min));
//          sb.append(" ");
//          sb.append(String.valueOf(max));
            
        
        // 이건 간단하지만 성능이 안좋음
        String answer = min+" "+max;
        return answer;
        
        //return sb.toString();
    }
}