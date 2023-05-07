import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        // if(date1[0]<date2[0]){
        //     return 1;
        // } else if (date1[0]==date2[0]){
        //     if(date1[1]<date2[1]){
        //         return 1;
        //     } else if(date1[1]==date2[1]) {
        //         if(date1[2]<date2[2]){
        //             return 1;
        //         }
        //     }
        // }
        // return 0;
        
        // 나처럼 복잡하게 푼사람 또 나밖에 없네.. ㅎㅎ
        // case1. for문으로 풀기
        // int answer=0;
        // for(int i=0; i<date1.length; i++){
        //     if(date1[i]<date2[i]){
        //         answer=1;
        //         break;
        //     } else if(date1[i]>date2[i]){
        //         answer=0;
        //         break;
        //     }
        // }
        // return answer;
        
        // case2. LocalDate 이용하기
        
        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
        
        return dateA.isBefore(dateB) ? 1 : 0;
    }
}