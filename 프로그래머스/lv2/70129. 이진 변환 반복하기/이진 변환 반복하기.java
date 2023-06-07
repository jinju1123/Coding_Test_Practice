class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int sum = 0;
        int count = 0;
        
        while(true){
            count++;
            String s1 = s.replaceAll("0", "");
            sum += s.length() - s1.length();
            
            if(s1.equals("1")){
                break;
            }
            
            s = Integer.toBinaryString(s1.length());
        }
        
        answer[0] = count;
        answer[1] = sum;
        
        return answer;
    }
}