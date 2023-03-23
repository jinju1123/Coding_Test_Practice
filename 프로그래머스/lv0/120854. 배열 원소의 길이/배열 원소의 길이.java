class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        // int[] answer = {}; 일때는 에러, 초기화 하니까 됐다.
            for(int i=0; i<strlist.length; i++){
                answer[i] = strlist[i].length();       
            } 
        return answer;
    }
}