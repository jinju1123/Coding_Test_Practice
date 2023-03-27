class Solution {
    public int solution(int price) {
        double answer = 0.0;
        if(100000 <= price && price < 300000 ){
          answer = price-((double)price*0.05);
        } else if(300000 <= price && price < 500000) {
          answer = price-((double)price*0.1);
        } else if(500000 <= price ) {
          answer = price-((double)price*0.2);
        } else {
            answer = price;
        }
        return (int)answer;
    }
}
    
    // 위에서 부터 쓰면 조건식을 두개씩 안써도 되는구나 생각해보니!!
    // 초간단하게 풀수 있다. price를 굳이 double로 바꾸지 않아도 됨.
    //    int answer = 0;
    //
    //    if(price>=500000) return (int)(price*0.8);
    //    if(price>=300000) return (int)(price*0.9);
    //    if(price>=100000) return (int)(price*0.95);
    //
    //    return price;