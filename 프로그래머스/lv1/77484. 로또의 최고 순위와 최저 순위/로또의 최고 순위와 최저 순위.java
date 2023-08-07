class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int[] answer = new int[2];
        
        // 지워진 번호의 갯수
        int unknownNum = 0;
        for(int i : lottos) {
            if(i == 0) unknownNum++;
        }
        
        // 맞춘 번호의 갯수
        int winningNum = 0;
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]) winningNum++;
            }
        }
        
        int maxNum = winningNum + unknownNum;
        int minNum = winningNum;
        
        if(maxNum == 6) {
            answer[0] = 1;
        } else if(maxNum == 5) {
            answer[0] = 2;
        } else if(maxNum == 4) {
            answer[0] = 3;
        } else if(maxNum == 3) {
            answer[0] = 4;
        } else if(maxNum == 2) {
            answer[0] = 5;
        } else {
            answer[0] = 6;
        }
        
        if(minNum == 6) {
            answer[1] = 1;
        } else if(minNum == 5) {
            answer[1] = 2;
        } else if(minNum == 4) {
            answer[1] = 3;
        } else if(minNum == 3) {
            answer[1] = 4;
        } else if(minNum == 2) {
            answer[1] = 5;
        } else {
            answer[1] = 6;
        }
        
        return answer;
    }
}