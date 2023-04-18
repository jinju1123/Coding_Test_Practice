class Solution {
    public int solution(int[] numbers, int k) {
        // 인덱스는 2씩 증가됨
        // 첫번째로 공을 던지는 사람은 인덱스가 0이므로 (k-1)
        // 배열의 길이보다 커질 수 있으므로 배열의 길이로 나눈 나머지를 대입
        return numbers[(k-1)*2 % numbers.length]; 
    }
}