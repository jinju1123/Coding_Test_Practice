import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
       int answer = 0;
        if(a == b && b == c && c == d) {
            answer = 1111 * a;
        }else if(a == b && b == c) {
            answer = (int) Math.pow((10*a+d),2);
        }else if(a == d && d == c) {
            answer = (int) Math.pow((10*a+b),2);
        }else if(b == d && d == c) {
            answer = (int) Math.pow((10*d+a),2);
        }else if(a == d && d == b) {
            answer = (int) Math.pow((10*a+c),2);
        }else if(a == b && c == d) {
            answer = (a + c) * Math.abs(a -c);
        }else if(a == c && b == d) {
            answer = (a + b) * Math.abs(a -b);
        }else if(a == d && c == b) {
            answer = (a + c) * Math.abs(a -c);
        }else if( a == b && a != c && a != d && c!=d) {
            answer = c*d;
        }else if( a == c && a != b && a != d && b!=d) {
            answer = b*d;
        }else if( a == d && a != b && a != c && b!=c) {
            answer = b*c;
        }else if( b == c && b != a && b != d && a!=d) {
            answer = a*d;
        }else if( b == d && b != a && b != c && a!=c) {
            answer = a*c;
        }else if( c == d && c != b && c != a && a!=b) {
            answer = a*b;
        }else{
            int min = 6;
            if(min >= a) min = a;
            if(min >= b) min = b;
            if(min >= c) min = c;
            if(min >= d) min = d;
            answer = min;
        }
        return answer;
    }
}