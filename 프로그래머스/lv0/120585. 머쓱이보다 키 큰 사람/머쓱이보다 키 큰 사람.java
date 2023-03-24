class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            if(height < array[i]){
                answer++;
            } 
        }
        return answer;
        // 향상된 for문을 사용하면 더 간단해진다.
        // for(int i : array) {
        //    if(i > height) answer++;
        // }
    }
}