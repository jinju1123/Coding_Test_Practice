class Solution {
    public int solution(int n, int m, int[] section) {
        
        int answer = 1;
        int mSection = section[0];
        
        for(int i : section){
            if(mSection + m > i) continue;
            
            mSection = i;
            answer++;
        }
        
        return answer;
    }
}