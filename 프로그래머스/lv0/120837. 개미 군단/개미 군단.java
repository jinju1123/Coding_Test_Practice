class Solution {
    public int solution(int hp) {
        // int answer = 0;
        // int x = hp / 5;
        // int y = 0;
        // int z = 0;
        // if(hp % 5 >= 3){
        //     y = (hp % 5) / 3;
        //     z = (hp % 5) % 3;
        // } else {
        //     y = hp % 5;
        //     z = 0;
        // }
        // answer = x + y + z;
        // return answer;
        
        // 간단하게 가능
        int answer = hp / 5;   // answer에 5로 나눈 몫 넣기
        hp %= 5;  // hp를 5로 나눈 나머지 값으로 변경
        answer += hp / 3;  // 기존 answer에 3로 나눈 몫 넣기
        hp %= 3;
        answer += hp / 1;
        return answer;
    }
}