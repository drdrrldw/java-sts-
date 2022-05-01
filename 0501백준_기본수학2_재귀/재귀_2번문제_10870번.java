
/*

피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597


n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.

출력
첫째 줄에 n번째 피보나치 수를 출력한다.

예제 입력 1 
10
예제 출력 1 
55

 */

package 백준0501재귀함수;

import java.util.Scanner;

public class 재귀_2번문제_10870번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(fibo(n));
		
	}
	
	public static int fibo(int n) {
		int count = 0;
		int fibo1 = 0, fibo2 = 1;
		
		fibo1 = fibo2;
		fibo2 = nacci(fibo1, fibo2);
		count++;
		
		
		return fibo1;
	}
	
	public static int nacci(int fibo1, int fibo2) {
		int fiboSum = fibo1 + fibo2;
		
		return fiboSum;
	}
	
	
}
