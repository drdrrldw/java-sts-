/*

주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력 1 
4
1 3 5 7
예제 출력 1 
3

 */


package 백준0427기본수학2;

import java.util.Scanner;

public class 기본수학2_1978번 {	//1번문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int pN = 0;
		
		for(int a = 0; a<N; a++) {
			int count = 0;
			int primeNum = sc.nextInt();
			
					
			for(int i = 1; i<=primeNum; i++) {
				if(primeNum % i == 0 ) count ++;
				if(count > 2) break;
			}
			if(count == 2) pN++; 
		}
		
		System.out.println(pN);
		
		
	}
}
