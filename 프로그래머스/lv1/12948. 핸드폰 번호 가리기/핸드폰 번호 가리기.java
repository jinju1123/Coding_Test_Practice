class Solution {
    public String solution(String phone_number) {
        
        // 풀이 1
        // String back = phone_number.substring(phone_number.length()-4);
        // String answer = "*".repeat(phone_number.length()-4);
        // return answer+back;
        
        // 풀이 2
        // String front = phone_number.substring(0, phone_number.length()-4);
        // String back = phone_number.substring(phone_number.length()-4);
        // String answer = front.replaceAll("[0-9]","*") + back;
        // return answer;
        
        // 풀이 3
        // char[] ch = phone_number.toCharArray();
        // for(int i = 0; i < ch.length - 4; i ++){
        //     ch[i] = '*';
        // }
        // return String.valueOf(ch);
        
        // 풀이 4 : 정규식은 대단해
        // return phone_number.replaceAll(".(?=.{4})", "*");
        
        char[] ch = phone_number.toCharArray();
        
        for(int i=0; i<ch.length-4; i++) {
            ch[i] = '*';
        }
        
        return String.valueOf(ch);
        
    }
}