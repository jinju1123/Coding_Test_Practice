class Solution {
    public int solution(int i, int j, int k) {
        // int answer = 0;
        // String kk = String.valueOf(k);
        // for(int l=i; l<=j; l++){
        //     String strL = String.valueOf(l);
        //     if(strL.contains(kk)){
        //         String[] arr = strL.split("");
        //         for(String a : arr) {
        //             if(a.equals(kk)) answer++;
        //         }
        //     }
        // }
        // return answer;
        // 간단하게 다시 풀기.. 이거 경이롭다 와우
        String str = "";
        for(int l=i; l<=j; l++){
            str += l+"";
        }
        return str.length() - str.replace(k+"","").length();
    }
}