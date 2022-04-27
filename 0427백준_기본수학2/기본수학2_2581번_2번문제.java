/*

자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

입력
입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.

M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

출력
M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.

예제 입력 1 
60
100

예제 출력 1 
620
61


예제 입력 2 
64
65

예제 출력 2 
-1

 */


package 백준0427기본수학2;

import java.util.Scanner;

public class 기본수학2_2581번_2번문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = 0, N = 0;
		M = sc.nextInt();
		N = sc.nextInt();
		
		int lowNum = 0, sum = 0;
		boolean flag = false;
		for(M=M; M <= N; M++) {
			int count = 0; 
			for(int i = 1; i<=M; i++) {
				if(M % i == 0) count++;
				if(count > 2) break;
			}
			if(count == 2) 	{
				sum += M;
				if(flag == false) {
					lowNum = M;
					flag = true;
				}
			}
			
		}
		
		if(flag == false && sum == 0) {System.out.println(-1);}
		else if(flag == true && sum != 0) {
			System.out.println(sum);
			System.out.println(lowNum);
		}
		
		
	}
}
