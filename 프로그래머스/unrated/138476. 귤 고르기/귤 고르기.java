import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // (원소 : 개수) 형태로 넣는 작업
        for(Integer key : tangerine){
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        
        // map에서 value값만 가져와서 list에 넣기
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer num : map.keySet()){
            list.add(map.get(num));
        }
        
        // list를 내림차순으로 정렬
        list.sort(Collections.reverseOrder());
        
        // 각 원소의 개수의 합(sum)이
        // 한 상자에 담으려는 귤의 개수 k보다 크거나 같으면
        // 그게 바로 경우의 수!
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            answer++;
            sum += list.get(i);
            if(sum >= k) break;
        }
        
        return answer;
    }
}