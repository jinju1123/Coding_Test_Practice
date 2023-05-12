class Solution {
    public String[] solution(String[] str_list) {
        
        String[] temp = new String[str_list.length];
        
        int idx = 0;
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")) {
                for(int j=0; j<i; j++){
                    temp[idx] = str_list[j];
                    idx++;
                }
                break;
            } else if(str_list[i].equals("r")) {
                for(int j=i+1; j<str_list.length; j++){
                    temp[idx] = str_list[j];
                    idx++;
                }
                break;
            }
        }
       
        String[] answer = new String[idx];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = temp[i];
        }
        
        return answer;
    }
}