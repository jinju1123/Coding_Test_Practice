import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
//         int answer = 0;
        
//         Arrays.sort(A); // 오름차순
        
//         // 내림차순을 위해 PriorityQueue 사용, sort()로 내림차순하면 효율성 통과 안됨..
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i=0; i<B.length; i++){
//              pq.add(B[i]);
//         }
        
//         int[] nB = new int[B.length];
        
//         for(int i=0; i<nB.length; i++){
//             nB[i] = pq.poll();
//         }
        
//         // 제일 큰 숫자가 제일 작은 숫자와 곱해지는 것이 최솟값이 나오므로
//         // 한 쪽은 오름차순 * 한 쪽은 내림차순 둘을 곱하면 그게 최솟값!
//         for(int i=0; i<A.length; i++){
//             answer += A[i] * nB[i];
//         }

//         return answer;
        
        // 그냥 for문으로 해결 가능이구나
        
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i -1];
        }

        return answer;
    }
}