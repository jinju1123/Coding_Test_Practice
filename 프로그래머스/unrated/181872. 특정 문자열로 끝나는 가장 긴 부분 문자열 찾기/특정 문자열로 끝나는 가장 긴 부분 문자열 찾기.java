class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
//         String[] str = new String[myString.length()];
        
//         if(myString.endsWith(pat)){
//             return myString;
//         } else {
            
//           for(int i=myString.length()-1; i>=0; i--){
//               str[i] = "";
//               str[i] += myString.substring(0, i);
//           }
        
//           for(String s : str) {
//              if(s.endsWith(pat)){
//                  answer = s;
//              } 
//           }
//             return answer; 
//         }
        // lastIndexOf를 쓰면 간단하게 풀이 가능^^ 어이상실
        int idx = myString.lastIndexOf(pat);
        return myString.substring(0, idx) + pat;
        
    }
}