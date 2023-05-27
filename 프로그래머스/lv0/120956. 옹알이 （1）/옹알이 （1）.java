import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        //int answer = 0;
        //aya 4
        //ayaye ayawoo ayama 12
        //ayayewoo ayawooye ayayema ayamaye ayawooma ayamawoo 24
        //ayayewooma ayayemawoo ayawooyema ayawoomaye ayamayewoo ayamawooye 24
            
//         String[] strArr = {"aya","ye","woo","ma"};
        
//         List<String> list = new ArrayList<>();
        
//         for(int i=0; i<strArr.length; i++){
//             for(int j=0; j<strArr.length; j++)
//                 if(i!=j) {
//                     list.add(strArr[i]+strArr[j]);
//                 }
//         }
        
//         String[] strArr2 = list.toArray(new String[0]);
//         List<String> list2 = new ArrayList<>();
        
//         for(int i=0; i<strArr2.length; i++){
//             for(int j=0; j<strArr.length; j++) {
//                 if(!strArr2[i].contains(strArr[j])){
//                     list2.add(strArr2[i]+strArr[j]);
//                 }
//             }
//         }
        
//         String[] strArr3 = list2.toArray(new String[0]);
//         List<String> list3 = new ArrayList<>();
        
//         for(int i=0; i<strArr3.length; i++){
//             for(int j=0; j<strArr.length; j++) {
//                 if(!strArr3[i].contains(strArr[j])){
//                     list3.add(strArr3[i]+strArr[j]);
//                 }
//             }
//         }
        
//         list.addAll(list2);
//         list.addAll(list3);
//         list.add("aya"); list.add("ye"); list.add("woo"); list.add("ma"); 
        
//         for(int i=0; i<list.size(); i++){
//             for(int j=0; j<babbling.length; j++){
//                 if(list.get(i).equals(babbling[j])){
//                     answer++;
//                 }
//             }
//         }
        
//         System.out.println(list.size());
        
//         return answer;
        
        // 너무 간단한 코드 발견... 식은 쉽지만 이렇게 생각을 하는게 진짜 어려운건데 대단쓰!!!
        int answer = 0;

        for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            
            if(babbling[i].isEmpty()) {
                answer++;
            }
        }

        return answer;
        
    }
}