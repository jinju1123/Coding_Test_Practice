class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        // for(String s : order){
        //     if(s.contains("americano")){
        //         answer += 4500;
        //     } else if(s.contains("cafelatte")){
        //         answer += 5000;
        //     } else if(s.contains("anything")){
        //         answer += 4500;
        //     }
        // }
        
        // 초 간단 방법이 있었다.. 좀만 더 생각해볼걸
        
        for(String s : order){
            if(s.contains("cafelatte")){
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        
        return answer;
    }
}