
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



import java.util.Scanner;

public class 재귀_2번문제_10870번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		sc.close();
		System.out.println(fibo(n, cnt));
		
	}
	
	public static int fibo(int n, int cnt) {
		if(n == 0) return 0;
		else if(n==1) return 1;
		int count = cnt;
		int f0 = 0, f1 = 1;
		int f2 = nacci(count, f0, f1, n);
		
		
	
		
		
		return f2; 
				
	}
	
	
	public static int nacci(int count, int f0, int f1, int n) {
		int fiboSum = f0 + f1;
		int cnt = count+1; 
		if(cnt == n) return f1;
		return nacci(cnt, f1, fiboSum, n);
	
	}
	
	
}
