class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        if(Math.abs(a-b)==1 && a/2 != b/2) return answer;
        
        while(true){
            answer++;
            if(a % 2 == 0){
                a = a/2;
            } else {
                a = (a+1)/2;
            }
            
            if(b % 2 == 0){
                b = b/2;
            } else {
                b = (b+1)/2;
            }
            
            if(Math.abs(a-b)==1 && a/2 != b/2) break;
        }

        return answer;
    }
}