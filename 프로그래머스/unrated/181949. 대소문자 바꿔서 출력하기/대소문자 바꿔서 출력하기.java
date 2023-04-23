import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        for(int i=0; i<a.length(); i++){
            if(Character.isUpperCase(a.charAt(i))){
                arr[i] = arr[i].toLowerCase();
            } else {
                arr[i] = arr[i].toUpperCase();
            }
        }
        String str = String.join("", arr);
        System.out.println(str);
        
    }
}