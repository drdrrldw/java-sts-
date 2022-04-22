/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
출력
입력으로 주어진 숫자 N개의 합을 출력한다.

예제 입력 1 
1
1
예제 출력 1 
1

예제 입력 2 
5
54321

예제 출력 2 
15

예제 입력 3 
25
7000000000000000000000000

예제 출력 3 
7


예제 입력 4 
11
10987654321

예제 출력 4 
46
 */
package 백준0422문자열;

import java.util.Scanner;

public class 문자열11720 { // 2번 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String numStr = sc.nextLine();

		int sum = 0;
		for (int i = 0; i < N; i++) {
			int a = numStr.charAt(i) - 48;
			sum += a;
		}
		System.out.println(sum);
		sc.close();

	}

}
