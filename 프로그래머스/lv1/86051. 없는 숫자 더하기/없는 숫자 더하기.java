class Solution {
    public int solution(int[] numbers) {
        
        int sumAll = 0;
        int sum = 0;
        
        for(int i=0; i<=9; i++){
            sumAll += i;
        }
        
        for(int n : numbers){
            sum += n;
        }
        
        return sumAll-sum;
    }
}