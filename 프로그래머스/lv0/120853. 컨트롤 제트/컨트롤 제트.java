class Solution {
    public int solution(String s) {
        int sum = 0;
        String[] str = s.split(" ");
        for(int i=0; i<str.length; i++){
            if(str[i].equals("Z")){
                str[i] = "-"+str[i-1];
                if(str[i].contains("--")){
                    str[i] = str[i].replaceAll("--", "");
                }
            }
            
            sum += Integer.parseInt(str[i]);
        }
        
        return sum;
    }
}