import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //for(int i=1; i<=n; i++){
        //    for(int j=0; j<i; j++){
        //        System.out.printf("*");
        //    }
        //    System.out.println("");
        //}
        
        // repeat 함수 쓰면 더 줄일 수 있다
        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
       
    }
}