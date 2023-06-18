class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        
        String str = "";
        
        for(int i=0; i<arr1.length; i++){
            
            // 2진수 OR 비트연산
            str = Integer.toBinaryString(arr1[i]|arr2[i]);
            
            // 앞에 0 출력 안되는거 반복문으로 해결
            String temp = "";
            if(str.length()<n) {
                for(int j=1; j<=n-str.length(); j++){
                    temp += "0";
                }
                str = temp+str;
            }
            answer[i] = str;
        }
        
        // 문자로 바꿔주기
        for(int i=0; i<answer.length; i++){
            answer[i] = answer[i].replaceAll("1","#");
            answer[i] = answer[i].replaceAll("0"," ");
        }
        
        return answer;
    }
}