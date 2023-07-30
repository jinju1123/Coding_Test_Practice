import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Double[] failrateArr = new Double[N];
        
        for(int i=1; i<=N; i++){
            double fail = 0;
            double challenge = 0;
            for(int j=0; j<stages.length; j++){
                if(stages[j]>=i) challenge++;
                if(stages[j]==i) fail++;
            }
            if(challenge != 0) {
                failrateArr[i-1] = fail/challenge;
            } else {
                failrateArr[i-1] = 0.0;
            }
        }        
        
        Double[] temp = Arrays.copyOf(failrateArr, failrateArr.length);
        
        Arrays.sort(temp, Collections.reverseOrder());
        
        for(int i=0; i<failrateArr.length; i++){
            for(int j=0; j<temp.length; j++){
                if(failrateArr[i]==temp[j]){
                    answer[j] = i+1;
                }
            }
        }
       
        return answer;
    }
}