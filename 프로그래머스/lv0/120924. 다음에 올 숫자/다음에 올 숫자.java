class Solution {
    public int solution(int[] common) {
        int answer = 0;
        for(int i=0; i<common.length; i++){
            
            int a = Math.abs(common[0]-common[1]);
            int b = Math.abs(common[1]-common[2]);
            
            // 등차 수열일 때
            if(a==b && common[0]>common[1]) {
                answer = common[common.length-1] - a; 
            } else if(a==b && common[0]<common[1]) {
                answer = common[common.length-1] + a;
            // 등비 수열일 때
            } else {
                if(common[1]!=0){
                    int c = common[2]/common[1];
                    answer = common[common.length-1] * c;
                } else {
                    answer = 0;
                }
            }
        }
        return answer;
    }
}