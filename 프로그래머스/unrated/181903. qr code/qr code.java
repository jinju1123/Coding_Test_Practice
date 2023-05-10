class Solution {
    public String solution(int q, int r, String code) {
        
//         String answer = "";
        
//         String[] strArr = new String[(code.length()/q) + 1];
        
//         for(int i=0; i<strArr.length; i++){
//             int s = i * q; 
//             int e = s + q; 
            
//             if (e <= code.length()){
//                 strArr[i] = code.substring(s, e);
//             } else {
//                 strArr[i] = code.substring(s);
//             }
//         }
        
//         for(int i=0; i<strArr.length; i++){
//             if(strArr[i].length() > r) {
//                 answer += strArr[i].charAt(r);
//             }
//         }
        
//         return answer;
        
        // 나 진짜 바본가? 문제를 안 읽는건가?ㅠㅠ 간단한 방법으로 풀자 뇌를 써봐 뇌를..
        String answer = "";
        String[] arr = code.split("");
        for (int i = 0; i < arr.length; i++) {
            if (i % q == r) {     // i를 q로 나누었을때 나머지가 r이라고 문제에 써있잖아 진주야..
                answer += arr[i];
            }
        }
        return answer;
    }
}