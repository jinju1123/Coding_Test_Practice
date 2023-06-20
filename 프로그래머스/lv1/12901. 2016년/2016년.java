import java.time.*;

class Solution {
    public String solution(int a, int b) {
        
        String answer = "";
        
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek day = date.getDayOfWeek();
        int dayNumber = day.getValue();
        
        if(dayNumber==1){
            answer = "MON";
        } else if(dayNumber==2){
            answer = "TUE";
        } else if(dayNumber==3){
            answer = "WED";
        } else if(dayNumber==4){
            answer = "THU";
        } else if(dayNumber==5){
            answer = "FRI";
        } else if(dayNumber==6){
            answer = "SAT";
        } else if(dayNumber==7){
            answer = "SUN";
        }
        
        return answer;
    }
}