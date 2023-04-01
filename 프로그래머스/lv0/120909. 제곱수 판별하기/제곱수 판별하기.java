import java.lang.Math;
class Solution {
    public int solution(int n) {
//         List<Integer> divi = new ArrayList<>();
//         for(int i=1; i<=n; i++){
//             if(n%i == 0){
//                 divi.add(i);
//             }
//         }
        
//         if(divi.size() % 2 == 0){
//             return 2;
//         }
//         return 1 ;
//     }
// 제곱근 구하는 함수 쓰면 간단하다  
        return n % Math.sqrt(n) == 0 ? 1 : 2;
}
}
