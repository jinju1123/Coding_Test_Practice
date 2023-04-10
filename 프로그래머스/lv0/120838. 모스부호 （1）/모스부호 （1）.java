class Solution {
    public String solution(String letter) {
        // String answer = "";
        // String[] str = letter.split(" ");
        // for(int i=0; i<str.length; i++){
        //     switch(str[i]) {
        //         case ".-" : answer += "a"; break;
        //         case "-..." : answer += "b"; break;
        //         case "-.-." : answer += "c"; break;
        //         case "-.." : answer += "d"; break;
        //         case "." : answer += "e"; break;
        //         case "..-." : answer += "f"; break;
        //         case "--." : answer += "g"; break;
        //         case "...." : answer += "h"; break;
        //         case ".." : answer += "i"; break;
        //         case ".---" : answer += "j"; break;
        //         case "-.-" : answer += "k"; break;
        //         case ".-.." : answer += "l"; break;
        //         case "--" : answer += "m"; break;
        //         case "-." : answer += "n"; break;
        //         case "---" : answer += "o"; break;
        //         case ".--." : answer += "p"; break;
        //         case "--.-" : answer += "q"; break;
        //         case ".-." : answer += "r"; break;
        //         case "..." : answer += "s"; break;
        //         case "-" : answer += "t"; break;
        //         case "..-" : answer += "u"; break;
        //         case "...-" : answer += "v"; break;
        //         case ".--" : answer += "w"; break;
        //         case "-..-" : answer += "x"; break;
        //         case "-.--" : answer += "y"; break;
        //         case "--.." : answer += "z"; break;
        //     }
        // }
        // return answer;
        
        // 위에는 머리가 고생한 케이스고.... 배열로 이렇게 푸는거임
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] str = letter.split(" ");
        
        for(int i=0; i<str.length; i++){
            for(int j=0; j<morse.length; j++){
                if(str[i].equals(morse[j])) answer += (char)(j+97);
            }
        }
        return answer;
    }
}