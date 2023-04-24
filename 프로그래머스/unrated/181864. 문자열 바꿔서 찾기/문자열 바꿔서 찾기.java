class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replaceAll("A", "C");
        myString = myString.replaceAll("B", "A");
        myString = myString.replaceAll("C", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}