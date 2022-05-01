
/*

0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

출력
첫째 줄에 N!을 출력한다.


예제 입력 1 
10

예제 출력 1 
3628800


예제 입력 2 
0

예제 출력 2 
1

 */

package 백준0501재귀함수;

import java.util.Scanner;

public class 재귀_1번문제_10872번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		System.out.println(factorial(N));
		
	}
	
	public static int factorial(int n) {
		int result =1;
		if(n == 1) return result;
		else if(n == 0) return result;
		result = n * factorial(n-1);
		
		return result;
	}
}
