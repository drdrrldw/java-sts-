/*

1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 
예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.

골드바흐의 추측은 유명한 정수론의 미해결 문제로, 
2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 
이러한 수를 골드바흐 수라고 한다. 
또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 
예를 들면, 

4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 
10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.

2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 
만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.


입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.

출력
각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.


제한
4 ≤ n ≤ 10,000


예제 입력 1 
3
8
10
16

예제 출력 1 
3 5
5 5
5 11

// 내가 풀어놨던 소인수분해 코드
	int N = sc.nextInt();
		
	if(N != 1) {
			
		for(int i = 2; i<=N; i++) {
			for(int j = i; N%j==0;) {
				if(N % i == 0) {System.out.println(j);
				N /= j;
				}
			}
		}




 */

import java.util.Scanner;

public class 기본수학2_9020번_6번문제 {	// 시간초과
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T = sc.nextInt();

		for (int a = 0; a < T; a++) {
			
			int n = sc.nextInt();
			int count = 0;
			boolean[] ar = new boolean[n + 1];

			ar[0] = ar[1] = true;

				for (int i = 2; i * i <= n; i++) {
					if (!ar[i]) {
						for (int j = i * i; j <= n; j += i) {
							ar[j] = true;
						}
					}
				}
				
			for(int i = 2; i<n; i++) {
				if(!ar[i]) count++;
			}	
			
			int[] primeSave = new int[count];   // 소수가 3개면 0~2
			int index = 0;
			for(int i = 2; i<n; i++) {
				if(!ar[i]) primeSave[index++]=i;
			}	

			int[] result = new int[2];
			int diff = 0;  count = 0;
			for(int i = 0; i<primeSave.length; i++) {
				for(int j = 0; j<primeSave.length; j++) {
					if (count >= 1 && primeSave[i] + primeSave[j] == n && diff > Math.abs(primeSave[i] - primeSave[j])) {
						result[0] = primeSave[j];
						result[1] = primeSave[i];
						diff = Math.abs( primeSave[i] - primeSave[j]);
					}else if( count == 0 && primeSave[i] + primeSave[j] == n ) {
						result[0] = primeSave[j];
						result[1] = primeSave[i];
						count ++;
						diff = Math.abs( primeSave[i] - primeSave[j]);
					}
				}
			}
			
			if(result[0] > result[1]) {
				System.out.println(result[1] + " " + result[0]);
			} else if(result[0] < result[1]) {
				System.out.println(result[0] + " " + result[1]);
			} else 
				System.out.println(result[0] + " " + result[1]);
		}
		
		
	}
}
