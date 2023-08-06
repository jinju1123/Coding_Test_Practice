import java.util.*;

class Solution {
    public int solution(String dartResult) {
        
        int answer = 0;
        
        // 숫자만 추출 해서 int[] 담기
        String[] aaa = dartResult.split("[^0-9]");
        int[] numArr = new int[3];
        int j = 0;
        
        for(int i=0; i<aaa.length; i++){
            if(!aaa[i].equals("")){
                numArr[j] = Integer.parseInt(aaa[i]);
                j++;
            }
        }
        
        // 배열에 담아서 하나씩 비교하기
        String[] strArr = dartResult.split("");
        int idx = 0;
        
        for(int i=1; i<strArr.length; i++) {
            if(strArr[i].equals("S")) {
                idx++;
            } else if(strArr[i].equals("D")) {
                numArr[idx] = numArr[idx] * numArr[idx];
                idx++;
            } else if(strArr[i].equals("T")) {
                numArr[idx] = numArr[idx] * numArr[idx] * numArr[idx];
                idx++;
            } else if(strArr[i].equals("#")) {
                numArr[idx-1] *= -1;
            } else if(strArr[i].equals("*")) {
                if(idx < 2) {
                    numArr[idx-1] *= 2;
                } else {
                    numArr[idx-2] *= 2;
                    numArr[idx-1] *= 2;
                }
            }
        }
        
        
        return numArr[0]+numArr[1]+numArr[2];
    }
}