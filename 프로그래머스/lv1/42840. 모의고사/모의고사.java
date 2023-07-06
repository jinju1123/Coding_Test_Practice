import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] nArr1 = {1,2,3,4,5};
        int[] nArr2 = {2,1,2,3,2,4,2,5};
        int[] nArr3 = {3,3,1,1,2,2,4,4,5,5};
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for(int i=0; i<answers.length; i++){
            int num = nArr1.length;
            if(i>=num){
                if(answers[i]==nArr1[i % num]){
                    cnt1++;
                }
            } else {
                if(answers[i]==nArr1[i]){
                    cnt1++;
                }
            }
        }
        
        for(int i=0; i<answers.length; i++){
            int num = nArr2.length;
            if(i>=num){
                if(answers[i]==nArr2[i % num]){
                    cnt2++;
                }
            } else {
                if(answers[i]==nArr2[i]){
                    cnt2++;
                }
            }
        }
        
        for(int i=0; i<answers.length; i++){
            int num = nArr3.length;
            if(i>=num){
                if(answers[i]==nArr3[i % num]){
                    cnt3++;
                }
            } else {
                if(answers[i]==nArr3[i]){
                    cnt3++;
                }
            }
        }
        
        System.out.println("cnt1 = " + cnt1 + " cnt2 = " + cnt2 + " cnt3 = " + cnt3);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(cnt1 > cnt2 && cnt1 > cnt3){
            list.add(1);
        } else if(cnt2 > cnt1 && cnt2 > cnt3){
            list.add(2);
        } else if (cnt3 > cnt1 && cnt3 > cnt2){
            list.add(3);
        } else if (cnt1 == cnt2 && cnt2 > cnt3){
            list.add(1);
            list.add(2);
        } else if (cnt1 == cnt3 && cnt3 > cnt2){
            list.add(1);
            list.add(3);
        } else if (cnt2 == cnt3 && cnt3 > cnt1){
            list.add(2);
            list.add(3);
        } else {
            list.add(1);
            list.add(2);
            list.add(3);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}