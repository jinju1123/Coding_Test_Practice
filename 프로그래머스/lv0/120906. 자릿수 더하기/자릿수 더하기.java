import java.util.stream.Stream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for(int num : digits){
            answer += num;
        }
        return answer;
    }
// 이거 이해가 안가는데 ....?
// class Solution {
//     public int solution(int n) {
//         int answer = 0;

//         while(n>0){
//             answer+=n%10;
//             n/=10;
//         }

//         return answer;
//     }
 }