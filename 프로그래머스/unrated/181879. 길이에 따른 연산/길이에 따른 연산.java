class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        if(num_list.length >= 11) {
            for(int n : num_list){
                sum += n;
            }
            return sum;
        } else {
            for(int n : num_list){
                mul *= n;
            }
            return mul;
        }
    }
}