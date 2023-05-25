class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String str = A;
        
        for(int i=0; i<A.length(); i++){
            if(str.equals(B)) {
                return answer;
            }
            
            String lastA = str.substring(str.length()-1);   // 마지막 글자만 뽑기
            str = lastA + str.substring(0, str.length()-1); // 마지막 글자 + 앞 4글자
            answer++;
        }
        
        return -1;
    }
}