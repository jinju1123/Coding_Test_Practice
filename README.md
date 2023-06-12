# Coding Test Practice
코테 연습용 공간입니다.   
<br>
<br>
<br>
<br>
--------------------------------
### 재귀함수        
<br>


함수가 직접 또는 간접적으로 **자기 자신을 호출하는 함수**를 재귀함수라고 한다.   
반드시 **종료 조건**이 필요하다는 특징을 가지고 있다.   
재귀 호출을 너무 많이 하게 되면 스택 메모리 영역에 많은 공간을 할당하게 되어   
**스택 오버플로우**가 발생할 수 있다는 점을 주의해야 한다.   
   
<br><br>
   
**단순 반복출력 예제**  
```java
public class Recursion {
	public static void main(String[] args)  {
		HelloWorld(5);
	}
	
	// HelloWorld 출력 메서드 선언
	public static void HelloWorld(int n){
		// 재귀함수 종료 조건
		if(n == 0)
			return;
		
		System.out.println("HelloWorld");
		HelloWorld(n-1); 
	}
}
```
<br><br>

**1부터 n까지 합계 출력 예제**   

```java
public class Recursion2 {
	public static void main(String[] args)  {
		int n = 5;
		System.out.print("1부터 " + n + "까지의 합계 : " + Sum(5));
	}
	
	// Sum 출력 메서드 선언
	public static int Sum(int n){
		// 재귀함수 종료조건
		if(n == 0)
			return 0;
				
		return n += Sum(n-1); 
	}
}
```
   
<br><br>
   
**피보나치 수열 예제**   
피보나치 수열이란 어떤 수열의 항이 앞에 두 항의 합과 같은 수열을 말한다.     
f(N) = f(N - 1) + f(N - 2)     
피보나치 수열은 숫자가 조금만 커져도 int 범위를 넘어버리기 때문에 항상 유의해야한다.
```java
public class FibonacciFunction {
	public static void main(String[] args)  {
		int n = 10;
		
		for(int i = 0; i < n; i++) 
			System.out.print(Fibonacci(i) + " ");
	}
	

	public static int Fibonacci(int n){
		if(n == 0)
			return 0;
		
		if(n == 1 || n == 2)
			return 1;
		
		else 
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}
```
   
<br><br>
   
<!-- 재귀함수에 대한 이해가 어려웠는데 정보처리기사 실기를 공부하다가 흥달쌤 C언어 특강에서 재귀함수 부분을 듣고 이해가 갔다.   
재귀함수는 상수가 나올 때까지 스택처럼 쌓는 것이라고 이해하면 된다! 헷갈리면 직접 손코딩 해보기! -->
