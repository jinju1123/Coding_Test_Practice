class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        for(int n : num_list){
            if(n%2==0) {
                even += String.valueOf(n);
            } else {
                odd += String.valueOf(n);
            }
        }
        return Integer.parseInt(even)+Integer.parseInt(odd);
    }
}