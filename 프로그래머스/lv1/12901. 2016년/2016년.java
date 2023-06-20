import java.time.*;

class Solution {
    public String solution(int a, int b) {
        
        // String answer = "";
        
        // LocalDate date = LocalDate.of(2016, a, b);
        // return date.getDayOfWeek().toString().substring(0,3);
        
        // 내장 메서드 안쓰는 풀이!! 깔끔하당
        
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }
        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
        
    }
}