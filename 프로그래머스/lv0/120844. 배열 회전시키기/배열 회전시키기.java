class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        if(direction.length() == 5) {
            int num1 = numbers[numbers.length-1];
            for(int i=numbers.length-1; i>0; i--){
                numbers[i] = numbers[i-1];
            }
            numbers[0] = num1;
            
        } else if (direction.length() == 4) {
            int num2 = numbers[0];
            for(int i=0; i<numbers.length-1; i++){
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length-1] = num2;
        }
        return numbers;
    }
}