/*

M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

예제 입력 1 
3 16
예제 출력 1 
3
5
7
11
13

*/

package 백준0427기본수학2;

import java.util.Scanner;

public class 기본수학2_1929번_4번문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		boolean [] ar = new boolean[N+1];
		
		for(int i = 0; i<M; i++) {
			ar[i] = true;
		}
		
		for(int i = 2; i*i<=N; i++) {
			int count = 0; 
			for(int j = 1; j<=i; j++) {
				 if(i % j  == 0) count++;
				 if(count > 2) break;
			 }
			if(count == 2) {
				ar[i] = false;
				for(int k = 2; i*k <= N; k++) {
					ar[i*k] = true;
				}
			}
		}
		
		
		
		for(int i = M; i<=N; i++) {
			if(ar[i] == false) System.out.println(i);
		}
		
		
	}
}
