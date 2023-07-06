class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int idx1 = 0;
        int idx2 = 0;
        
        for(int i=0; i<goal.length; i++){
            if(cards1[idx1].equals(goal[i])){
                // 마지막 인덱스면(다 돌면) 1증가 안하게 설정
                idx1 = (idx1 < cards1.length-1 ) ? idx1 + 1 : idx1;
            } else if(cards2[idx2].equals(goal[i])){
                idx2 = (idx2 < cards2.length-1 ) ? idx2 + 1 : idx2;
            } else {
                // 둘 다 아니면 문장을 만들 수 없다는 뜻이니까 No 리턴
                return "No";
            }
        }
        
        return "Yes";
    }
}