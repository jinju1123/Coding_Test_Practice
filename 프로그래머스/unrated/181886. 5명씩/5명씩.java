class Solution {
    public String[] solution(String[] names) {
        String str = "";
        for(int i=0; i<names.length; i+=5){
            str += names[i]+" ";
        }
        String[] answer = str.split(" ");
        return answer;
    }
}