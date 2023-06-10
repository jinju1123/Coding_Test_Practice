class Solution {
    public int solution(int n) {
        
//         String str = Integer.toBinaryString(n);
        
//         int nlen = 0;
//         for(char c : str.toCharArray()){
//             if(c=='1') nlen++;
//         }
        
//         while(true) {
//             n++;
//             String num = Integer.toBinaryString(n);
//             int numlen = 0;
//             for(char c : num.toCharArray()){
//                 if(c=='1') numlen++;
//             }
//             if(nlen==numlen) break;
//         }
        
//         return n;
        
        // bitCount()란 메서드가 있었다!! 새로 배웠당
        // bitCount() - 이진법으로 변환 후 1의 개수를 반환
        
        int nlen = Integer.bitCount(n);
        
        while(true){
            n++;
            int nnlen = Integer.bitCount(n);
            if(nlen == nnlen) break;
        }
        
        return n;
        
    }
}