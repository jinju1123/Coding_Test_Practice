class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        // int[] answer = {}; 일때는 에러, 이건 길이가 0인 배열을 생성한거라 값을 넣으려면 길이를 정해줘야함.
            for(int i=0; i<strlist.length; i++){
                answer[i] = strlist[i].length();       
            } 
        return answer;
    }
}