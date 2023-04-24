class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String answer = "";
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]) {
                answer += todo_list[i] + " ";
            }
        }
        String[] str = answer.split(" ");
        return str;
    }
}