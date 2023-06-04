class Solution {
    public String solution(String s) {
        
        // split함수에서 -1을 넣으면 비어있는 값도 데이터로 인식한다.
        String[] strArr = s.split(" ", -1);
        
        for(int i=0; i<strArr.length; i++){
             // strArr[i]가 공백이 아니면 if문 수행
            if(strArr[i].length() >= 1){
                // 문자열의 0번째 인덱스(시작)가 숫자로 시작하면
                if(Character.isDigit(strArr[i].charAt(0))){
                    strArr[i] = strArr[i].toLowerCase();
                } else {
                    strArr[i] = strArr[i].substring(0,1).toUpperCase() +
                                strArr[i].substring(1).toLowerCase();
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        // 위에서 구한 strArr배열을 원래의 string 형태로 변환하기
        for(int i=0; i<strArr.length; i++){
            sb.append(strArr[i]);
            if(strArr[i] != strArr[strArr.length-1]) sb.append(" ");
        }
        
        return sb.toString();
    }
}