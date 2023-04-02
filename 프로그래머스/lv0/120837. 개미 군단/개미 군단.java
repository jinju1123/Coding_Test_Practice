class Solution {
    public int solution(int hp) {
        int answer = 0;
        int x = hp / 5;
        int y = 0;
        int z = 0;
        if(hp % 5 >= 3){
            y = (hp % 5) / 3;
            z = (hp % 5) % 3;
        } else {
            y = hp % 5;
            z = 0;
        }
        answer = x + y + z;
        return answer;
    }
}