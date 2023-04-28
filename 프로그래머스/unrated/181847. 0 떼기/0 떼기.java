class Solution {
    public String solution(String n_str) {
        // String answer = "";
        // for(int i=0; i<n_str.length(); i++){
        //     if(n_str.charAt(i)!='0'){
        //         answer = n_str.substring(i);
        //         break;
        //     }
        // }
        // return answer;
        
        // 어차피 int로 바꾸면 0이 뗴지니까.. 바꾸고 다시 스트링으로 변경.. 어처구니없음 고민왜했냐
        return ""+Integer.parseInt(n_str);
    }
}