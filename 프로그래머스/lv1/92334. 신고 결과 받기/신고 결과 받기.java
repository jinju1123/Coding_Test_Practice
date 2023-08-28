import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // 중복 제거 (같은 사람 신고 X)
        
        List<String> noRedun = new ArrayList<>(new HashSet<>(Arrays.asList(report)));
        String[] report1 = noRedun.toArray(new String[0]);
        
        // 정지 된 사람 구하기
        int[] xUser = new int[id_list.length];
        
        for(int i=0; i<report1.length; i++){
            int idx = report1[i].indexOf(" ");
            String x = report1[i].substring(idx+1);
            
            for(int j=0; j<id_list.length; j++) {
                if(id_list[j].equals(x)) {
                    xUser[j]++;
                }
            }
        }
        
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<xUser.length; i++){
            if(xUser[i]>=k) {
                list.add(id_list[i]);
            }
        }
        
        String[] outUser = list.toArray(new String[0]);
        
        // 정지 된 사람을 신고한 사람 구하기
        List<String> answerList = new ArrayList<>();
        
        for(int i=0; i<report1.length; i++) {
            
            int idx = report1[i].indexOf(" ");
            String x = report1[i].substring(idx+1);
            
            for(int j=0; j<outUser.length; j++) {
                if(x.equals(outUser[j])) {
                    String reportUser = report1[i].substring(0, idx);
                    answerList.add(reportUser);
                }
            }
        }
        
        // 메일 받은 갯수 구하기
        
        int[] answer = new int[id_list.length];
        
        for(int i=0; i<answerList.size(); i++) {
            for(int j=0; j<id_list.length; j++) {
                if(answerList.get(i).equals(id_list[j])) {
                    answer[j]++;
                }
            }
        }
        
        return answer;
    }
}