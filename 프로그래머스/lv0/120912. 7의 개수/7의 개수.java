class Solution {
    public int solution(int[] array) {
        int answer = 0;
//         String[] strArr = new String[array.length];
//         for(int i=0; i<array.length; i++){
//             strArr[i] = String.valueOf(array[i]);
//         }
        
//         String str = String.join("", strArr);
        
//         for(int i=0; i<str.length(); i++){
//             if(str.charAt(i) == '7'){
//                 answer++;
//             }
//         }
//         return answer;
        
        // 나머지를 이용한 풀이.. 하 난 이게 너무 어렵다
        for(int a : array){
            while(a != 0) {
                if(a % 10 == 7) {
                    answer++;
                }
                a /= 10;
            } 
        }
        return answer;
    }
}