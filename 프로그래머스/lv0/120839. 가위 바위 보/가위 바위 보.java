class Solution {
    public String solution(String rsp) {
        char[] ch = rsp.toCharArray();
        for(int i=0; i<ch.length; i++){
            if (ch[i]=='0'){
                ch[i] = '5';
            } else if(ch[i]=='2'){
                ch[i] = '0';
            } else if(ch[i]=='5'){
                ch[i] = '2';
            }
        }
        String answer = new String(ch);
        return answer;
    }
}