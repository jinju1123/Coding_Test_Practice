class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int[] numArr = new int[1000];
        
        for(int i=0; i<array.length; i++) {
            numArr[array[i]]++;
            
            if(max < numArr[array[i]]){
                max = numArr[array[i]];
                answer = array[i];
            }
        }
        
        int temp = 0;
        for(int i=0; i<numArr.length; i++) {
            if(max == numArr[i]) temp++;
            if(temp > 1) answer = -1;
        }
        
        return answer;
    }
}