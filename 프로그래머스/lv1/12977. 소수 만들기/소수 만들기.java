class Solution {
    public int solution(int[] nums) {

         // 임의의 숫자 3개를 뽑아서 더했을 때 소수가 되는 경우의 수
        
        int answer = 0;
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    
                    int sum = nums[i]+nums[j]+nums[k];
                    int cnt = 0;
                    for(int l=2; l<sum; l++){
                        if(sum % l == 0) cnt++;
                    }
                    if(cnt == 0) answer++;
         
                }
            }
        }
    
        return answer;

    }
}