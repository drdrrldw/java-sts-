/*

어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 

예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 
물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.

자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

출력
첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.

예제 입력 1 
216
예제 출력 1 
198


 */

package 백준0506브루트포스;


import java.util.Scanner;

public class 브루트포스_2번문제_2231번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int cycle = 100_0000, result = 0;
		boolean[] selfNumArr = new boolean[cycle + 1];
		selfNumArr[0] = true;

		for (int j = 1; j <= cycle; j++) {
			if (j < 100)
				result = j + j / 10 + j % 10;
			if (j < 1000)
				result = j + j / 100 + (j / 10) % 10 + j % 10;
			if (j < 10000)
				result = j + j / 1000 + (j / 100) % 10 + (j / 10) % 10 + j % 10;
			if (j < 100000)
				result = j + j / 10000 + (j / 1000) % 10 + (j / 100) % 10 + (j / 10) % 10 + j % 10;
			if (j < 1000000)
				result = j + j / 100000 + (j / 10000) % 10 + (j / 1000) % 10 + (j / 100) % 10 + (j / 10) % 10 + j % 10;
			if (result > cycle)
				continue;
			selfNumArr[result] = true;
		}

		

		if (!selfNumArr[N])
			System.out.println("0");
		else {
			result = 0;
			for (int i = 1; i < N; i++) {
				if (i < 10)
					result = i + i;
				if (i < 100)
					result = i + i / 10 + i % 10;
				if (i < 1000)
					result = i + i / 100 + (i / 10) % 10 + i % 10;
				if (i < 10000)
					result = i + i / 1000 + (i / 100) % 10 + (i / 10) % 10 + i % 10;
				if (i < 100000)
					result = i + i / 10000 + (i / 1000) % 10 + (i / 100) % 10 + (i / 10) % 10 + i % 10;
				if (i < 1000000)
					result = i + i / 100000 + (i / 10000) % 10 + (i / 1000) % 10 + (i / 100) % 10 + (i / 10) % 10
							+ i % 10;
				if (result == N) {
					System.out.println(i);
					break;
				}

			}

		}

	}
}
