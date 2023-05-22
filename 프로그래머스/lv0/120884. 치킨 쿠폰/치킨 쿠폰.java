class Solution {
    public int solution(int chicken) {
        
        int answer = 0;
        
        while ( chicken >= 10 ) { 
            int coupon = chicken / 10;
            int restCoupon = chicken % 10;
            chicken = coupon + restCoupon;
            
            answer += coupon;
        }
        
        return answer;
    }
}